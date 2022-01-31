package day01_practice12_01_2021;

public class PatientInfo {

    public static void main(String[] args) {

        /*
Create a class named PatientInfo. declare the following variables:

                         1. name (String)
                         2. age (int)
                         3. gender (char)
                         4. date of birth (String)
                         5. isMarried (boolean)
                         6. phone number (String)
                         7. havingInsurance (boolean)
                         8. Insurance number (String)
                         9. Employer (String)
                        10. copayWithInsurance (double)
                        11. copayWithoutInsurance (double)
 */

        String name = "Marius";
        int age = 69;
        char gender = 'M';
        String dateOfBirth = "June 26th, 1987";
        boolean isMarried = false;
        String phoneNumber = "(850)402-6969";
        boolean havingInsurance = true;
        String insuranceNumber = "D7678-3224";
        String employer = "Cydeo";
        double copaWithInsurance = 20.00;
        double copaWithoutInsurance = 250.00;

        System.out.println("name: " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("dateOfBirth = " + dateOfBirth);
        System.out.println("isMarried = " + isMarried);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("havingInsurance = " + havingInsurance);
        System.out.println("insuranceNumber = " + insuranceNumber);
        System.out.println("employer = " + employer);
        System.out.println("copaWithInsurance = " + copaWithInsurance);
        System.out.println("copaWithoutInsurance = " + copaWithoutInsurance);


        System.out.println("=========Escape Sequences============");

        System.out.println("\tname: "+name+"\n\tage: "+age+"\n\tgender: "+gender);

        System.out.println();

        if (havingInsurance){
            System.out.println("copay of patient = " + copaWithInsurance);
        }else {
            System.out.println("copaWithoutInsurance = " + copaWithoutInsurance);
        }








    }
}
