package factorymethod;

public class PdfDocumentFactory extends documentfactory {
    public Document createDocument() {
        return new PdfDocument();
    }

}
