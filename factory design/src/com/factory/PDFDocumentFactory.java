package com.factory;

import com.*;
public class PDFDocumentFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
