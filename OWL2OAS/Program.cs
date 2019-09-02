﻿using System;
using System.Collections.Generic;
using System.Text;
using VDS.RDF;
using VDS.RDF.Ontology;
using VDS.RDF.Parsing;
using YamlDotNet.Serialization;

namespace OWL2OAS
{
    class Program
    {
        static void Main(string[] args)
        {
            // Load ontology graph
            OntologyGraph g = new OntologyGraph();
            FileLoader.Load(g, args[0]);

            // Create OAS object
            OASDocument document = new OASDocument();

            // Create OAS Info header
            OASDocument.Info info = new OASDocument.Info();
            info.title = "RealEstateCore API";
            info.version = "\"3.1\"";
            OASDocument.License license = new OASDocument.License();
            license.name = "MIT";
            info.license = license;
            document.info = info;

            // Parse OWL classes. For each class, create a schema and a path
            document.components = new OASDocument.Components();
            Dictionary<string, OASDocument.Schema> schemas = new Dictionary<string, OASDocument.Schema>();
            Dictionary<string, OASDocument.Path> paths = new Dictionary<string, OASDocument.Path>();
            foreach (OntologyClass c in g.OwlClasses)
            {
                // Get human-readable label for API (should this be fetched from other metadata property?)
                // TODO: pluralization metadata for clean API?
                string classLabel = GetLabel(c, "en");

                // Create schema for class
                OASDocument.Schema schema = new OASDocument.Schema();
                schemas.Add(classLabel, schema);

                // Create path for class
                OASDocument.Path path = new OASDocument.Path();
                paths.Add("/" + classLabel, path);

                // Create each of the HTTP methods
                // TODO: PUT, PATCH, etc
                path.get = new OASDocument.Get();
                path.get.summary = "Get all '" + classLabel + "' objects.";
                path.get.responses = new Dictionary<string, OASDocument.Response>();
                
                // Create each of the HTTP response types
                OASDocument.Response response = new OASDocument.Response();
                response.description = "A paged array of '" + classLabel + "' objects.";
                path.get.responses.Add("200", response);
            }
            document.components.schemas = schemas;
            document.paths = paths;

            DumpAsYaml(document);
            
            // Keep window open during debug
            Console.WriteLine("Press any key to quit.");
            Console.ReadKey();
        }

        private static void DumpAsYaml(object data)
        {
            var stringBuilder = new StringBuilder();
            var serializer = new Serializer();
            stringBuilder.AppendLine(serializer.Serialize(data));
            Console.WriteLine(stringBuilder);
            Console.WriteLine("");
        }

        private static string GetLabel(OntologyResource ontologyResource, string language)
        {
            foreach (ILiteralNode label in ontologyResource.Label)
            {
                if (label.Language == language)
                {
                    return label.Value;
                }
            }
            return ontologyResource.Resource.ToString();
        }
    }
}
