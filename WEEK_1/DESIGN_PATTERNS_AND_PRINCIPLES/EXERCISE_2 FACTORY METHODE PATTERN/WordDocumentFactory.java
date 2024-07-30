package factorymethod;

public class WordDocumentFactory extends documenfFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
