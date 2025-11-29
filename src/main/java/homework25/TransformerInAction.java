package main.java.homework25;
import java.util.ArrayList;
import java.util.List;

public class TransformerInAction {
    public static void main(String[] args) {
        Autobot bumbleBee = new Autobot("BumbleBee");
        Deceptikon starScream = new Deceptikon("StarScream");
        Autobot optimusPrime = new Autobot("OptimusPrime");
        Deceptikon demoleasher = new Deceptikon("Demoleasher");

        showTransformerActions("BumbleBee", bumbleBee);
        showTransformerActions("StarScream", starScream);
        showTransformerActions("OptimusPrime", optimusPrime);
        showTransformerActions("Demoleasher", demoleasher);

        System.out.println("*** Transformers List ***");
        List<Transformer> transformers = new ArrayList<>();  // <- точка с запятой здесь
        transformers.add(optimusPrime);
        transformers.add(bumbleBee);
        transformers.add(demoleasher);
        transformers.add(starScream);

        for (Transformer t : transformers) {
            showTransformerActions("-> " + t.getName(), t);
        }
        System.out.println();
    }

    public static void showTransformerActions(String name, Transformer transformer) {
        System.out.println("*** " + name + " actions ***");
        transformer.run();
        transformer.fire();
        transformer.charge();
        transformer.transform();
        transformer.showProperties();
        System.out.println();
    }
}


