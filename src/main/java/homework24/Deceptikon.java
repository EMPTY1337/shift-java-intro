package main.java.homework24;

class Deceptikon extends Transformer {
    public Deceptikon(String name) {
        super(name);
        this.kindness = false;
    }
    private final String teamName = "Deceptikons";
    private final String eyeColor = "red";
    private boolean kindness;

    public void transform() {
        System.out.println(name + " transform in  superjet");
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