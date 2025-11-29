package main.java.homework25;

class Autobot extends Transformer implements Action{
    public Autobot(String name) {
        super(name);
        this.kindness = true;
    }
    private static final String teamName = "Autobots";
    private static final String eyeColor = "blue";
    private boolean kindness;

    @Override
    public void transform() {
        System.out.println(name + " transforms into a car");
    }

    @Override
    public void fire() {
        System.out.println(name + " is firing with shotgun");
    }

    @Override
    public void charge() {
        System.out.println(name + " is charging by positive energy");
    }

    @Override
    public void run() {System.out.println(name + " is running");}


    public void showProperties() {
        System.out.println("*** " + name + " Properties ***");
        System.out.println("Team: " + teamName);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Kindness: " + kindness);
        System.out.println();
    }
}

