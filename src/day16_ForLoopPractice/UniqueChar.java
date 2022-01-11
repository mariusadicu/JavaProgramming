package day16_ForLoopPractice;

public class UniqueChar {

    public static void main(String[] args) {

        String str = "aaabccc";

        String  result = "";

                //      i <= str.length()-1
        for (int i = 0; i < str.length(); i++) { //i: index number of str (starting from 0)

            char ch = str.charAt(i); //ch: each character of str
            if (str.indexOf(ch) == str.lastIndexOf(ch)){ //if the first and last index number are same, then the character is unique
                result += ch;
            }

        }

        System.out.println(result);








    }
}
/*
 2. Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */