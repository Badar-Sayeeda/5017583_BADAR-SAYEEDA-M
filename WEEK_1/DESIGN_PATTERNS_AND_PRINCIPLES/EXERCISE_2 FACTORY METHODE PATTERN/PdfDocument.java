package factorymethod;

public class PdfDocument implements Document {
    public void create() {
        System.out.println("Opening PDF Document");
    }
}
