package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,4,5,5,6,7,7,7,2,4,6};

        int[] unique = uniqueElements(array);

        System.out.println(Arrays.toString(unique));

    }




    // returns the unique elements of the array as 
    public static int[] uniqueElements(int[] array) {
        int[] result = {}; // new int[0]

        for (int each : array){

            if (ArraysUtility.frequencyOfElement(array, each) == 1 ){ // if the frequency is one, the element is unique
                ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    // returns the unique elements of the array as 
    public static double[] uniqueElements(double[] array) {
        double[] result = {}; 

        for (double each : array){

            if (ArraysUtility.frequencyOfElement(array, each) == 1 ){ // if the frequency is one, the element is unique
                ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }


    // returns the unique elements of the array as 
    public static char[] uniqueElements(char[] array) {
        char[] result = {};

        for (char each : array){

            if (ArraysUtility.frequencyOfElement(array, each) == 1 ){ // if the frequency is one, the element is unique
                ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }


    // returns the unique elements of the array as 
    public static String[] uniqueElements(String[] array) {
        String[] result = {};

        for (String each : array){

            if (ArraysUtility.frequencyOfElement(array, each) == 1 ){ // if the frequency is one, the element is unique
                ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }
    
    
}
