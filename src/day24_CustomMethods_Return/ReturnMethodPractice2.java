package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {

        // create a function that can calculate the grade

        String str1 = grade(95);

        /*
        check the grade:
        'A' ==> Excelent
        'B' ==> Great
        ........
         */

        if (str1.equalsIgnoreCase("A")){
            System.out.println("Excelent");
        }else if (str1.equalsIgnoreCase("B")){
            System.out.println("Great");
        }else if (str1.equalsIgnoreCase("C")){
            System.out.println("Good");
        }else if (str1.equalsIgnoreCase("D")){
            System.out.println("Passed");
        }else {
            System.out.println("Try again!");
        }



    }


    public static String grade(int score){

        String result = "";

        if (score < 0 || score > 100){

            result = "Invalid";

        }else { // valid

            result = (score >= 90)?"A" :(score >= 80)?"B" :(score >= 70)?"C" :(score >= 60)?"D" :"F";

        }

        return result;

    }


}
