package builderpattern;

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a Computer instance using the Builder
        Computer computer = new Computer.Builder()
            .setCPU("Intel i7")
            .setRAM("16GB")
            .setStorage("1TB SSD")
            .build();
        
        // Print the Computer details
        System.out.println(computer);
    }
}

