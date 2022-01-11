package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[][] arr2D = {{1,2,3}, {4,5,6}, {7,8,9}};


        // 3 dimensional array contains 2 d arrays

        //                      0         1        2            0             1           2
        int[][][] arr3D = {  {{1,2,3}, {4,5,6}, {7,8,9}} ,  {{10,20,30}, {40,50,60}, {70,80,90}}   };
        //                            0                                     1

        //[index num of 2DArray][index num of 1D Array][index number of elements]

        System.out.println(Arrays.deepToString(arr3D));

        //{{10,20,30}, {40,50,60}, {70,80,90}}
        System.out.println( Arrays.deepToString(arr3D[1] ) );

        //{40,50,60}
        System.out.println( Arrays.toString(arr3D[1][1] ) );

        //9
        System.out.println(arr3D[0][2][2]);

        System.out.println("------------------------------");

        for(int[][] each2D  :  arr3D ){
            for(int[] each1D : each2D ){
                for(int element : each1D ){
                    System.out.println(element);
                }
            }
        }

        System.out.println("-----------------------------------------");

        //int[][][][] arr4D = { };
        int[][][][] arr4D = {   {{{1,2,3}, {4,5,6}, {7,8,9}} ,{{10,20,30}, {40,50,60}, {70,80,90}}}    };
        //                                             0

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int element : each1D) {
                        System.out.println(element);
                    }
                }
            }
        }



    }
}

/*
task1:
         9 10 11 12 13
         4 5 6 7 8
         1 2 3

task2:
         3 2 1
         8 7 6 5 4
         13 12 11 10 9

task3:
         13 12 11 10 9
         8 7 6 5 4
         3 2 1

 */

/*
 System.out.println("-------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) { // i: indexes of each 1D array started from 0

            for (int j = arr2D[i].length - 1; j >= 0; j--) { // j: indexes of each element starting from last index
                System.out.print( arr2D[i][j]+" " );
            }

            System.out.println();

        }

        System.out.println("------------------------------------------");

 */
