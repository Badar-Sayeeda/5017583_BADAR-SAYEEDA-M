package builderpattern;

public static class Builder {
    private String CPU;
    private String RAM;
    private String storage;

    public Builder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public Builder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public Builder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }
}
