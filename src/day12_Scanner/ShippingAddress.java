package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter yur full name: ");
        String fullName = scan.nextLine(); //Java ProgramingEnter

        System.out.println("Enter your building number: ");
        String building = scan.next(); //7925A

        scan.nextLine(); //Enter

        System.out.println("Enter your street name: ");
        String street = scan.nextLine(); //Loblolly Bay DriveEnter

        System.out.println("Enter your city name: ");
        String city = scan.nextLine(); //DestinEnter

        System.out.println("Enter your state name: ");
        String state = scan.next(); //FLEnter

        System.out.println("Enter your zip code: ");
        String zipCode = scan.next(); //32550Enter

        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);

        scan.close();

    }
}
/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )  // + nextLine()
3. Enter your street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state name ( next() )
6. Enter your zip code ( next() )

Display the shipping address
 */