package day11_Switch_Scaner;
/*
   if the grade is A or B or C or D ====> "Passed"
   otherwise ===> "Failed"
*/
public class Grade2 {

    public static void main(String[] args) {

       char ch = 'A';

        switch (ch){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;

            default:
                System.out.println("Failed");

        }

        System.out.println("-------------------------------------------");

        String result = "";

        switch (ch){

            case 'A': case 'B': case 'C': case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";

        }

        System.out.println(result);

    }

}
