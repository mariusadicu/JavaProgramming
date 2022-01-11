package day23_CustomMethods_Void;

public class Dinner5 {

    /*
    5. create a method that can calculate the grade of the student based on the score
     */

    public static void main(String[] args) {

        gradeOfStudent(9);

    }

    public static void gradeOfStudent(int grade){

        if (grade <= 100 && grade >= 90){
            System.out.println('A');
        }else if (grade < 90 && grade >= 80){
            System.out.println('B');
        }else if (grade < 80 && grade >= 70){
            System.out.println('C');
        }else if (grade < 70 && grade >= 60){
            System.out.println('D');
        }else {
            System.out.println("Failed");
        }

    }








}
