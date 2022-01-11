package day11_Switch_Scaner;
/*
a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid

 */
public class Grade {

    public static void main(String[] args) {

        char ch = 'F'; // ==
        String result = "";

        switch (ch) { //A,B,C,D,F

            case 'A':
                result = "Excellent";
                break; // exits the switch after the case block

            case 'B':
                result = "Great Job";
                break;

            case 'C':
                result = "Good";
                break;

            case 'D':
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
