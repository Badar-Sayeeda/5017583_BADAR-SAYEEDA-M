package factorymethod;

public class DocumentFactoryTest {
    public static void main(String[] args) {
        // Create a factory for Word documents
        documentfactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open(); // Output: Opening Word Document

        // Create a factory for PDF documents
        documentfactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open(); // Output: Opening PDF Document

        // Create a factory for Excel documents
        documentfactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open(); // Output: Opening Excel Document
    }
}

