package main.java.homework21;

public class LogicalOperationTable {

    public static void main(String[] args) {


        System.out.println("P\t      Q\t   P AND Q\tP OR Q\tP XOR Q\tNOT P");

        boolean p1 = false;
        boolean q1 = false;
        System.out.println(p1 + "\t" + q1 + "\t" +(p1 && q1) + "\t" + (p1 || q1) + "\t" + (p1 ^ q1) +"\t" + (!p1));

        boolean p2 = true;
        boolean q2 = false;
        System.out.println(p2 + "\t" + q2 + "\t" +(p2 && q2) + "\t" + (p2 || q2) + "\t" + (p2 ^ q2) + "\t" + (!p2));

        boolean p3 = false;
        boolean q3 = true;
        System.out.println(p3 + "\t" + q3 + "\t" +(p3 && q3) + "\t" + (p3 || q3) + "\t" + (p3 ^ q3) + "\t" + (!p3));

        boolean p4 = true;
        boolean q4 = true;
        System.out.println(p4 + "\t" + q4 + "\t" +(p4 && q4) + "\t" + (p4 || q4) + "\t" + (p4 ^ q4) + "\t" + (!p4));
    }
}
