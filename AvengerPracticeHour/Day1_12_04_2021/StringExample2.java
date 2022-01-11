package Day1_12_04_2021;

public class StringExample2 {

    public static void main(String[] args) {

        /*
        String str = "CYDEO";

        int lastIndexOfChar = str.length() - 1;
        int lastsecondOfChar = str.length() - 2;

        String result = "" + str.charAt(lastsecondOfChar) + str.charAt(lastIndexOfChar);

        // System.out.println(result+result+result);
        System.out.println("result = " + result.repeat(3));
        */


        String str = "CYDEO";
        int lastsecondOfChar = str.length() - 2;
        String chars = str.substring(lastsecondOfChar);
        System.out.println(chars.repeat(3));

    }
}
