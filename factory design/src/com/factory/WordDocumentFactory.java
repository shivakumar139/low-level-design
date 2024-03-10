package com.factory;

import com.Document;
import com.WordDocument;

public class WordDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
