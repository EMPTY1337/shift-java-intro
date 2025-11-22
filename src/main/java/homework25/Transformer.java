package main.java.homework25;

abstract class Transformer {
    protected String name;

    public Transformer(String name) {
        this.name = name;
    }
    public abstract void transform();

    public String getName() {
        return name;
    }
}

