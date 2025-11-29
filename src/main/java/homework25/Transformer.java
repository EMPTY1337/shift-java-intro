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
    public abstract void run();
    public abstract void fire();
    public abstract void charge();
    public abstract void showProperties();
}

