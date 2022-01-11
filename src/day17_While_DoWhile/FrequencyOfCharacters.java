package day17_While_DoWhile;
/*
2. Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "AAABBBC";
                    char = 'A';

                output: 3
 */
public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0; //+1+1+1 ==> 3

        for (int i = 0; i < str.length(); i++) { //i: indexes of str
            char eachChar = str.charAt(i); //eachChar: each character of str

            //'A' == 'A'
            if (ch == eachChar){ //if given ch is matching with the eachChar, then ch is appeared in the string
                frequency++;
            }

        }

        System.out.println(frequency);




    }
}
