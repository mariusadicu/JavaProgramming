package day36_Inheritage.sportTask;

public class Football extends Sport {

    public String goalKeeper;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefere, String rules,String goalKeeper) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
        this.goalKeeper = goalKeeper;

    }

    public String toString() {
        return "Football{" +
                "goalKeeper='" + goalKeeper + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfRefere +
                ", rules='" + rules + '\'' +
                '}';
    }

    public void goalScore(){
        System.out.println(name + "scoring a goal");
    }




}
