package day36_Inheritance.sportTask;

public class AmericanFootball extends Sport {

    public String quarterback;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefere, String rules, String quarterback) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
        this.quarterback = quarterback;
    }

    public String toString() {
        return "AmericanFootball{" +
                "quarterback='" + quarterback + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfRefere +
                ", rules='" + rules + '\'' +
                '}';
    }

    public  void touchDown(){
        System.out.println(name+" is scoring a touchdown");
    }







}
