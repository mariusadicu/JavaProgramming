package Day3_12_18_2021;

public class ThreeDigitsWithNestedLoop {

    public static void main(String[] args) {


        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                  int abc = 100*a+10*b+c;
                    System.out.println(abc);
                }
            }
        }








    }
}