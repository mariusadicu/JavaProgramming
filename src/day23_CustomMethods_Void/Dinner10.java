package day23_CustomMethods_Void;

public class Dinner10 {

    /*
    10. create a method that can can convert dollar to lira
     */

    public static void main(String[] args) {

     dollarToLira(350);

    }

    public static void dollarToLira(double dollar){

        double lira = dollar * 9.8;
        System.out.println("lira = " + lira);

    }




}
