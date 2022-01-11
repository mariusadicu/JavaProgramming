package day23_CustomMethods_Void;

import java.util.Arrays;

public class Dinner17 {

    /*

    17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")
     */

    public static void main(String[] args) {

        anagaram("race","care");

    }

    public static void anagaram(String word1,String word2){

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);

        if (anagram){
            System.out.println(word1 + " and " + word2 + " is Anagram");
        }else {
            System.out.println("Not an Anagram");
        }




    }









}
