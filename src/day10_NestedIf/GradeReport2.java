package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {
        

        int s = 95;

       /*
        if (s >= 0 && s <= 100){
            //5 posibilities:

            if (s >= 90){
                System.out.println("excellent");
            }else if (s >= 80){
                System.out.println("great");
            }else if (s >= 70){
                System.out.println("good");
            }else if (s >= 60){
                System.out.println("passed");
            }else{
                System.out.println("failed");
            }

        }else{ //if the s is NOT valid
            System.out.println(" Invalid Score");
        }
       */


        String result = (s >= 0 && s <= 100)? (s >= 90)? "excellent" :(s >= 80)? "great" :(s >= 70)? "good"
                :(s >= 60)? "passed" : "failed" : " Invalid Score";

        System.out.println(result);



    }
    
    

}
