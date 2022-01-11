package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Jimmy";
        String lastName = "King";
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "Apple INC";
        double salary =  100000.58;

        String fullName = firstName + " " + lastName;

        // Full name of the person is ___________
        System.out.println("Full name of the person is " + fullName);

        //____ is __ years old
        System.out.println(fullName + " is " + age + " years old ");

        //FullName is JobTitle, works at CompanyName, and FullName's salary is Salary
        System.out.println(fullName + " is " + jobTitle +", works at " + companyName
                    + ", and " + fullName + "'s salary is $" + salary);




    }


}
/*
1. CreateaclasscalledFullName.java 2. Declarethefollowingvariables:
1. firstName 2. lastName
3. Useconcatenationtoprintthefulladdress
 */