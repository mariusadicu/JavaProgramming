package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        /*
        1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
         */

        String[] name = {"Serghei Gddt", "Hulya Kgyrd", "Irina Ooiyft", "Mert Ore", "Anastasia Snjdu", "Hilal Khgu", "Turan Bghv", "Edison Xmen", "Marius Doo", "Irina Dweds"};

        for (String each : name){
            String initials = each.charAt(0)+". "+each.charAt( each.indexOf(" ")+1 );
            System.out.println(initials);
        }


    }
}
