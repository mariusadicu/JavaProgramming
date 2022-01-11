package Day1_12_04_2021;

public class StringExample {

    public static void main(String[] args) {

        /*
        "Hello" to "HE"
         */

        /*
        String str = "Hello";
        str = str.toUpperCase();
        String s = "" + str.charAt(0) + str.charAt(1);
        System.out.println("s = " + s);
        */


        String str = "Hello";
        str = str.toUpperCase();
        System.out.println("str = " + str.substring(0,2));


    }
}
