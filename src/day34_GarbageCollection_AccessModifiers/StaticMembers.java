package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {    //  public access modifier

    static class class1{        // default access modifier, we can make static classes only the inner class

    }




    public static int num = 100;

    public static void methode(){

    }

    static {

    }


}

class A{
        static class B{ // inner class can be static only
            public static void method(){

            }
        }
}

class C{
    public static void main(String[] args) {
        A.B.method();/// to call methode from classB, we call A, then B then we call methode.
    }
}