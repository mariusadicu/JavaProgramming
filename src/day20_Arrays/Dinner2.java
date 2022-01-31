package day20_Arrays;

public class Dinner2 {

    public static void main(String[] args) {

        /*
        2. create string array, and store the names of your  classmates (10)
            reverse each students names and print them in separate line
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
         */

        String[] classmates = {"Serghei", "Hulya", "IrinaO", "Mert", "Anastasia", "Hilal", "Turan", "Edison", "Marius", "IrinaD"};


        for (String names : classmates) {

            String reverse = "";

            for (int i = names.length()-1; i >= 0; i--) {

                reverse += names.charAt(i);

            }

            System.out.println(reverse);
            System.out.println();

        }





    }
}
