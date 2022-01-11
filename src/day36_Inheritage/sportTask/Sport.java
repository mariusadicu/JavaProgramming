package day36_Inheritage.sportTask;

public class Sport {

    /*
    Sports Task:
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfRefere, rules



			methods:
				setInfo()
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google

     */

    public String name;
    public int numberOfPlayers;
    public int numberOfRefere;
    public String rules;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefere, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
    }

    public void play() {
        System.out.println(name + " are playing");
    }

    public void train(){
        System.out.println(name+" is training");
    }




    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfRefere +
                ", rules='" + rules + '\'' +
                '}';
    }


}