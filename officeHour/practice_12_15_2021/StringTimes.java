package practice_12_15_2021;

import java.util.Scanner;

public class StringTimes {

    public static void main(String[] args) {

      /*

                     (StringTimes)
                    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

                     input String : Hi  ,  input int : 2

                     output: HiHi
       */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any word.");
        String word = scan.nextLine();

        System.out.println("Enter any positive number");
        int num = scan.nextInt();

    //    int count = 0;
        String sum = "";

    //    while (count < num){
    //        sum += word; // sum = "Ho" + "Ho" = "HoHo"
    //        count++;
    //    }


        for (int i = 0; i < num; i++){
            sum += word; // sum = "Ho" + "Ho" = "HoHo" + "Ho" = "HoHoHo"
        }
        System.out.println(sum);

        scan.close();

    }
}
