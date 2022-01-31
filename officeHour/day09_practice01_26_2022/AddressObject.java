package day09_practice01_26_2022;

public class AddressObject {

    public static void main(String[] args) {

        Address home = new Address();

        home.setStreet("123 Abc Rd");
        home.setCity("Destin");
        home.setState("FL");
        home.setZipCode("32541");

        System.out.println("Home address: " + home);

        home.setZipCode("8965655665");
        home.setStreet("");

        System.out.println("Home address " + home);


        Address work = new Address("123 Abc Rd", "Destin", "FL", "32541");
        System.out.println("Work address " + work);









    }
}
