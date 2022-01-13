package day36_Inheritance.sportTask;

public class Basketball extends Sport {

    public int differentZoneToScore;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefere, String rules,int differentZoneToScore) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
        this.differentZoneToScore = differentZoneToScore;

    }

    public String toString() {
        return "BasketBall{" +
                "differentZoneToScore=" + differentZoneToScore +
                ", name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfRefere +
                ", rules='" + rules + '\'' +
                '}';
    }

    public void slamDunk(){
        System.out.println(name+" is scoring a slam dunk");
    }



}
