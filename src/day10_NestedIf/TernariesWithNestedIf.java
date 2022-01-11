package day10_NestedIf;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int s = 85;

        /*
        if (s >= 0 && s <= 100) { //if score is valid

            if (s >= 60) { //if student passed the exam
                System.out.println("Passed");
            } else { //if the student failed exam
                System.out.println("Failed");
            }

        }else { //if the score is not valid
            System.out.println("Invalid Score");
        }
        */

        String result = (s >= 0 && s <= 100)? (s >= 60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result);




    }








}
