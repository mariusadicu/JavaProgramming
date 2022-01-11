package Day3_12_18_2021;

public class LoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++){
            System.out.println("i = " + i);
        }

        System.out.println();

        System.out.println("--------------------------------------------");


        // even numbers from 0 ~ 100
        for (int i = 0; i < 100; i += 2){
            System.out.print(" "+i);
        }

        System.out.println();
        System.out.println("----------------------------------------------");

        // odd numbers from 1 ~ 100
        for (int i = 1; i < 100; i += 2){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("-------------------------------------------------");

        // divided by numbers with 5 from 0 ~ 100
        for (int i = 0; i < 100; i += 5){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------");

        // even numbers from 100 ~ 0
        for (int i = 100; i >= 0; i -= 2){
            System.out.print(" "+i);
        }




    }
}
/*
 Classic for-loop counting up from 0 to 99
                 0, 1, 2, 3, ... 99
                -init int i = 0
                -test i<100
                -increment i++
 */