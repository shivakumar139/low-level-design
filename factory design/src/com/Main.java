package com;

import com.factory.DocumentFactory;
import com.factory.PDFDocumentFactory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new PDFDocumentFactory();
        Document pdfDocument = documentFactory.createDocument();
        
        pdfDocument.generate();
    }
}
