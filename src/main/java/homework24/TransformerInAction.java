package main.java.homework24;

public class TransformerInAction {
    public static void main(String[] args){
        Autobot BumbleBee = new Autobot("BumbleBee");
        Deceptikon StarScream = new Deceptikon("StarScream");
        Autobot OptimusPrime = new Autobot("OptimusPrime");
        Deceptikon Demoleasher = new Deceptikon("Demoleasher");

        System.out.println("*** BumbleBee actions ***");
        BumbleBee.run();
        BumbleBee.fire();
        BumbleBee.charge();
        BumbleBee.transform();
        BumbleBee.showProperties();

        System.out.println("*** StarScream actions ***");
        StarScream.run();
        StarScream.fire();
        StarScream.charge();
        StarScream.transform();
        StarScream.showProperties();

        System.out.println("*** OptimusPrime actions ***");
        OptimusPrime.run();
        OptimusPrime.fire();
        OptimusPrime.charge();
        OptimusPrime.transform();
        OptimusPrime.showProperties();

        System.out.println("*** Demoleasher actions ***");
        Demoleasher.run();
        Demoleasher.fire();
        Demoleasher.charge();
        Demoleasher.transform();
        Demoleasher.showProperties();
    }
}
