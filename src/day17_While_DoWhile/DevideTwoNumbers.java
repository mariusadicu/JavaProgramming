package day17_While_DoWhile;

import java.util.Scanner;

public class DevideTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       // int num1 = 4;
       // int num2 = 10;

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        double divi=0;

/*
        // 1. version

        while(num1-num2 >= 0 ){
            divi++;
            num1 -= num2;
        }
*/

       // 2. version

        while (num1 >= num2){
            num1 = num1-num2;
            divi++;
        }

         System.out.println(divi);



    }
}
/*
1. Write a program that can divide two positive numbers
without using / (division) and * (multiplication) operators.
 */