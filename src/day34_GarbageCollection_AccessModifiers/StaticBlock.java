package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {


        System.out.println("MAin Methode");

    }
    static {
        System.out.println("Ststic block1"); // always runs first, and only one times\

    }// we can have many static blocks, but runs only one

    static {
        System.out.println("Ststic block2"); // always runs first, and only one times\

    }static {
        System.out.println("Ststic block3"); // always runs first, and only one times\

    }
}
