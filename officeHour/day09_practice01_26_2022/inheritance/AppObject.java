package day09_practice01_26_2022.inheritance;

public class AppObject {

    public static void main(String[] args) {

        //Instagram
        Instagram instagram = new Instagram("5.6");
        System.out.println("Instagram "+instagram);
        instagram.useTheApp(10);


        //Discord
        Discord discord = new Discord("Discord","6.75");
        discord.useTheApp(100);
        System.out.println("Discord "+discord);




    }
}
