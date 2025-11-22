package main.java.homework25;
import java.util.ArrayList;
import java.util.List;

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

        System.out.println("*** Transformers List ***");
        List<Transformer> transformers = new ArrayList<>();
        transformers.add(OptimusPrime);
        transformers.add(BumbleBee);
        transformers.add(Demoleasher);
        transformers.add(StarScream);
        for (Transformer transformer : transformers) {
            System.out.println("-> " + transformer.getName());
        }
        System.out.println();
    }

}
