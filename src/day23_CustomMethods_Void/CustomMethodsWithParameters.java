package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

       // oddOrEven(); // the method demainds additional info to complete its task

        oddOrEven(10);

        ageOfPerson(1995);

        printNumbers(23,32);



    }

    // create a function that can check if a number is odd number of even  number ==> oddOrEven()
    public static void oddOrEven(int number){ // 10

        if (number % 2 == 0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is odd number");
        }

    }

    // create a function that can display the age of the person ==> ageOfPerson()
    public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;

        System.out.println("You age is " + age);

    }

    //  create a function that can print all the numbers between x and y ==> printNumber()
    public static void printNumbers(int x, int y){

        for (int i = x+1; i < y; i++) {
            System.out.println(i);
        }

    }






}

