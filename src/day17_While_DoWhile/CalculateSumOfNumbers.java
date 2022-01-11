package day17_While_DoWhile;

import java.util.Scanner;

public class CalculateSumOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        while (true){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num < 0){
                break;
            }

        }
*/
        int num;
        int result = 0;

       do{
            System.out.println("Enter a number");
            num = scan.nextInt();
            result +=num;

        }while (num > 0);

        System.out.println(result-num);


   /*     do{                                             // it gives the wrong result, it takes in consideration the '-' ecuation
            System.out.println("Enter a number:");
            num = scan.nextInt();
            result += num;

        }while (num>0);

        System.out.println("result = " + result);
*/

        scan.close();

    }
}


/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */