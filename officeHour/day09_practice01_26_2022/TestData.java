package day09_practice01_26_2022;

public class TestData {

    public static final String username = "username";
    public static final String password = "123";

    //username = "abc";

    public final void finalMethod(){
        System.out.println("Final method");
    }


}


class Child extends TestData{

    // @Override
    // public void finalMethod() {
    //    super.finalMethod();
    // }


}