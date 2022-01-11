package day17_While_DoWhile;

import java.util.Scanner;

public class NumberAndOperator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char ch = scan.next().charAt(0);

        while ( !(ch == '+' || ch == '-' || ch == '*' || ch == '/') ){
            System.err.println("Invalid Operator, Please re-enter:");
            ch = scan.next().charAt(0);
        }

        System.out.println( (ch == '+')? num1 + num2 :(ch == '-')? num1 - num2 :(ch == '*')? num1 * num2 : num1 / num2 );






    }
}
/*
 3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user
		 provides a valid operator (+, -, *, /)

 */