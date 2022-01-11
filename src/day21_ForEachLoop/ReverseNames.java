package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] names = {"Serghei Gddt", "Hulya Kgyrd", "Irina Ooiyft", "Mert Ore", "Anastasia Snjdu", "Hilal Khgu", "Turan Bghv", "Edison Xmen", "Marius Doo", "Irina Dweds"};

        for (String each : names) { // each: "Serghei Gddt", "Hulya Kgyrd", "Irina Ooiyft", "Mert Ore" ...

            String reversed =  "";

            for (int i = each.length()-1; i >= 0; i--) {
               reversed += each.charAt(i);
            }

            System.out.println(reversed);
        }

        /*
           String reversed = "";

            for (int i = each.length()-1; i>= 0; i--) {
            for (int i = each.length()-1; i>= 0; i--) { // reverses the string
                reversed += each.charAt(i);
            }
         */








    }
}
