package main.java.homework24;

class Autobot extends Transformer {
    public Autobot(String name) {
        super(name);
        this.kindness = true;
    }
    private static final String teamName = "Autobots";
    private static final String eyeColor = "blue";
    private boolean kindness;

    public void transform() {
        System.out.println(name + " transforms into a car");
    }

    public String getTeamName() {
        return teamName;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean getKindness() {
        return kindness;
    }


    public void showProperties() {
        System.out.println("*** " + name + " Properties ***");
        System.out.println("Team: " + teamName);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Kindness: " + kindness);
        System.out.println();
    }
}

