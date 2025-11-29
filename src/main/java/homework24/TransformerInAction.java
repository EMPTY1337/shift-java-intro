package main.java.homework24;

public class TransformerInAction {
    public static void main(String[] args){
        Autobot bumbleBee = new Autobot("BumbleBee");
        Deceptikon starScream = new Deceptikon("StarScream");
        Autobot optimusPrime = new Autobot("OptimusPrime");
        Deceptikon demoleasher = new Deceptikon("Demoleasher");

        System.out.println("*** BumbleBee actions ***");
        bumbleBee.run();
        bumbleBee.fire();
        bumbleBee.charge();
        bumbleBee.transform();
        bumbleBee.showProperties();

        System.out.println("*** StarScream actions ***");
        starScream.run();
        starScream.fire();
        starScream.charge();
        starScream.transform();
        starScream.showProperties();

        System.out.println("*** OptimusPrime actions ***");
        optimusPrime.run();
        optimusPrime.fire();
        optimusPrime.charge();
        optimusPrime.transform();
        optimusPrime.showProperties();

        System.out.println("*** Demoleasher actions ***");
        demoleasher.run();
        demoleasher.fire();
        demoleasher.charge();
        demoleasher.transform();
        demoleasher.showProperties();
    }
}
