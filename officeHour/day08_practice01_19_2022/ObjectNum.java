package day08_practice01_19_2022;

public class ObjectNum {

    public static void main(String[] args) {

        ObjectNum on1 = new ObjectNum();
        ObjectNum on2 = on1;
        ObjectNum on3 ;
        on3 = new ObjectNum();
        ObjectNum on4 = on3;
        on4 = new ObjectNum();

        // total 3 objects, only count the "new" objects

    }
}
