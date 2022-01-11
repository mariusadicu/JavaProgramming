package Day1_12_04_2021;

public class StringExample3 {

    public static void main(String[] args) {

        /*
        "Hello" to "ell:
         */

        String str = "Selcuk"; // "elcu"

        /*
         String svar = str.substring(1,str.length()-1);
         System.out.println(svar);
         */


         char firstChar = str.charAt(0);
         char lastChar = str.charAt(str.length()-1);

         str = str.replace(firstChar,' '); // " elcuk"
         str = str.replace(lastChar, ' '); // " elcu "

         //System.out.println(str);
        System.out.println(str.trim());


    }
}
