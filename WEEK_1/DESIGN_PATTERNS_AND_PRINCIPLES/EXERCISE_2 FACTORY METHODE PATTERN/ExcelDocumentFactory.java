package factorymethod;

public class ExcelDocumentFactory extends documentfactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
