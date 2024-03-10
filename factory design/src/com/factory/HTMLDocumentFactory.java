package com.factory;

import com.Document;
import com.HTMLDocument;

public class HTMLDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new HTMLDocument();
    }
}
