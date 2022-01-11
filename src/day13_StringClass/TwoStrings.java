package day13_StringClass;

import java.util.Scanner;

/*
write a program that asks user to enter two strings, and print out the longest string
 */
public class TwoStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = scan.next();

        System.out.println("Enter second string:");
        String s2 = scan.next();

        int lengthOfS1 = s1.length();
        int lengthOfS2 =s2.length();

        if(lengthOfS1!=lengthOfS2){

            if(lengthOfS1>lengthOfS2){
                System.out.println(s1);
            }else{
                System.out.println(s2);
            }

        }else{
            System.out.println("sentences length are equal");
        }

        scan.close();

    }
}
