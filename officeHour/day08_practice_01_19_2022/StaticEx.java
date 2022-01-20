package day08_practice_01_19_2022;

public class StaticEx {

    static void method1(){ // methods only run when you call them
        System.out.print(3);
    }

    public static void main(String[] args) {
        System.out.print(5);
        // method1();
    }

    static { // static block always executes first
        System.out.print(7);
    }

}
