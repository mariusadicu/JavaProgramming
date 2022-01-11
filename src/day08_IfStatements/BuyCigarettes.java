package day08_IfStatements;
/*
Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 */
public class BuyCigarettes {

    public static void main(String[] args) {

        byte age = 13;

        boolean isEligible = age >= 21;

        if (isEligible){
            System.out.println("The person is eligible to buy cigarettes");}

        if (!isEligible){
            System.out.println("The person is NOT eligible to buy cigarettes");}






    }






}
