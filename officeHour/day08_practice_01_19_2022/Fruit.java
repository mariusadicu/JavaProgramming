package day08_practice_01_19_2022;

public class Fruit { // class, only one public class

    Juice juice;


    public Fruit(String color){
        juice = new Juice(color);
    }

}


class Juice { // inside the class is another class, but you can not make public
    String color;

    public Juice(String color){
        this.color = color;
    }

}
