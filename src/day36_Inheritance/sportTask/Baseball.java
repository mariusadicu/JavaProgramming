package day36_Inheritance.sportTask;

public class Baseball extends Sport {

    public String batterName, catcherName, pitcherName;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefere, String rules, String batterName, String catcherName, String pitcherName) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
        this.batterName = batterName;
        this.catcherName = catcherName;
        this.pitcherName = pitcherName;
    }

    public String toString() {
        return "Baseball{" +
                "batterName='" + batterName + '\'' +
                ", catcherName='" + catcherName + '\'' +
                ", pitcherName='" + pitcherName + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfRefere +
                ", rules='" + rules + '\'' +
                '}';
    }

    public void homeRun(){
        System.out.println(name+" is scoring home run");
    }



}
