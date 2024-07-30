package factorymethod;

public class ExcelDocument implements Document {
    public void create() {
        System.out.println("Opening Excel Document");
    }
}