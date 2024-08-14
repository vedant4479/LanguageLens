package com.example.languagelens;

import java.util.Properties;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class POSTagger {
    public static StanfordCoreNLP initPOSTagger(String language) {
        Properties props = new Properties();

        // Set up annotators depending on the language
        switch (language) {
            case "English":
                props.setProperty("annotators", "tokenize,ssplit,pos");
                break;
            case "Hindi":
                props.setProperty("annotators", "tokenize,ssplit,pos");
                props.setProperty("tokenize.language", "hi");
                props.setProperty("pos.model", "edu/stanford/nlp/models/pos-tagger/spanish/spanish-distsim.tagger");
                break;
            case "German":
                props.setProperty("annotators", "tokenize,ssplit,pos");
                props.setProperty("tokenize.language", "de");
                props.setProperty("pos.model", "edu/stanford/nlp/models/pos-tagger/german/german-hgc.tagger");
                break;
            // Add cases for other languages as needed
        }

        return new StanfordCoreNLP(props);
    }
}
