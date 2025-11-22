package main.java.homework25;

class Deceptikon extends Transformer implements Action {
    public Deceptikon(String name) {
        super(name);
        this.kindness = false;
    }
    private final String teamName = "Deceptikons";
    private final String eyeColor = "red";
    private boolean kindness;

    @Override
    public void transform() {
        System.out.println(name + " transform in  superjet");
    }

    @Override
    public void fire() {
        System.out.println(name + " is firing with laserprojectiles");
    }

    @Override
    public void charge() {
        System.out.println(name + " is charging by negative emotions");
    }


    public void showProperties() {
        System.out.println("*** " + name + " Properties ***");
        System.out.println("Team: " + teamName);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Kindness: " + kindness);
        System.out.println();
    }
}