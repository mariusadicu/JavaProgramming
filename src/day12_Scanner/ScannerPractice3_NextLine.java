package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Enter

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine(); //Wooden SpoonEnter

        System.out.println("Enter your Programing Language: ");
        String programing = scan.nextLine(); //Java Programing LanguageEnter

        System.out.println("Enter your age: ");
        int age = scan.nextInt(); //24Enter

        scan.nextLine(); // capture the Enter key that the user pressed for nextInt()

        System.out.println("Enter your school name: ");
        String schoolName = scan.nextLine(); //

        System.out.println("fullName = " + fullName);
        System.out.println("programing = " + programing);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        scan.close();



    }
}
