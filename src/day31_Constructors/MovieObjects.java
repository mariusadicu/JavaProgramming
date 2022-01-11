package day31_Constructors;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA","Journey to SDET: Cydeo Batch 25","Adventure, Comedy, Thriller","10/25/2021","Kuzzat Altay");

        String[] casts = {"Anastasia","Billy","Jerry","Tom","Ben","Alcapone"};

        movie1.addCast("Leo");
        movie1.addCasts(casts);

        System.out.println(movie1);






    }
}
