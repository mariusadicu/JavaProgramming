package day23_CustomMethods_Void;

public class Dinner9 {

    /*
    9. create a method that can convert dollar to euro
     */

    public static void main(String[] args) {

        dollarToEuro(100);

    }

    public static void dollarToEuro(double dollar){

        double euro = dollar * 0.86;
        System.out.println("euro = " + euro);


    }




}
