package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "James King",
                buildingNumber = "11821B",
                streetName = "Jones Branch Dr",
                city = "McLane",
                state ="VA",
                zipeCode = "22031A";


       /* String name = "James King";
        String buildingNumber = "11821B";
        String streetName = "Jones Branch Dr";
        String
*/

        //System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + ", " + zipeCode);

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + ", " + zipeCode;
        System.out.println(address);


    }

}
/*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address


Ex:

 */