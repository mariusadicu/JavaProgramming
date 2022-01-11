package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,9));

        int n = 3;

        for (int i = 1; i < n; i++) {
            list.removeIf( p -> Collections.max(list) == p );
        }

        /*
        list.removeIf( p -> Collections.max(list) == p ); // remove 1st max number
        list.removeIf( p -> Collections.max(list) == p ); // remove again the 1st max number
         */

        int max = Collections.max(list);

        System.out.println(max);






    }
}
/*

 */