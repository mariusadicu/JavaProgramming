package day36_Inheritage.sportTask;

public class SportObjects {

    public static void main(String[] args) {

        Football football1 = new Football();
        football1.setInfo("FC Cluj Napoca", 10,4,"No Hands","BuFFon");
        football1.play();
        football1.goalScore();

        System.out.println(football1);

        Baseball baseball1 = new Baseball();
        baseball1.setInfo("Cubs",69,6,"hit the ball","Mr Jhones","Mike Dallas","Danny Devito");
        baseball1.play();
        baseball1.homeRun();

        System.out.println(baseball1);

        Basketball basketball1 = new Basketball();
        basketball1.setInfo("Chicago Bulls", 6, 2,"dont kill your opponent", 3);

        basketball1.play();
        basketball1.slamDunk();
        System.out.println(basketball1);


        AmericanFootball americanFootball1 = new AmericanFootball();
        americanFootball1.setInfo("Beavers",12,5,"no rulles","Tom Bradye");

        americanFootball1.play();
        americanFootball1.touchDown();
        System.out.println(americanFootball1);






    }
}
