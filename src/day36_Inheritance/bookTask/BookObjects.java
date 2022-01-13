package day36_Inheritance.bookTask;

public class BookObjects {

    public static void main(String[] args) {

        EBook eBook1 = new EBook();
        eBook1.setInfo("Sapiens","Knolage","Yuval Noah Harari",29.00,250,469);
        eBook1.readBook();

        System.out.println(eBook1);


        AudioBook audioBook1 = new AudioBook();
        audioBook1.setInfo("Sapiens","Self Growth","Yuval Noah Harari",29.00,"9 hours and 45 minutes","Kim Kardshian");
        audioBook1.listen();

        System.out.println(audioBook1);








    }
}
