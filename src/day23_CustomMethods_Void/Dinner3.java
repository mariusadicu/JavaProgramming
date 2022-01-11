package day23_CustomMethods_Void;

public class Dinner3 {

    /*
        3. create a method that can check if a person is eligible to buy alcohol
     */

    public static void main(String[] args) {

        eligibleToBuyAlcohol(33);

    }

    public static void eligibleToBuyAlcohol(int age){

        if (age >= 21){
            System.out.println("Eligible to buy alcohol!");
        }else {
            System.out.println("Not eligible to buy alcohol!");
        }

    }





}
