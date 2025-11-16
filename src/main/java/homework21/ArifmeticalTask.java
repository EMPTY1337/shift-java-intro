package main.java.homework21;

public class ArifmeticalTask {
    public static void main(String[] args) {

    double ydavLength = 3.8 ;

    double parrotHeight = ydavLength / 38;
    double monkeyHeight = ydavLength / 5;
    double elephantHeight = ydavLength / 2;
    double totalHeight = ydavLength + parrotHeight + monkeyHeight + elephantHeight;

    System.out.println("Длина удава: " + ydavLength + " м");
    System.out.println("Рост попугая: " + parrotHeight + " м");
    System.out.println("Рост мартышки: " + monkeyHeight + " м");
    System.out.println("Рост слона: " + elephantHeight + " м");
    System.out.println("Общий рост: " + totalHeight + " м");

    }
}
