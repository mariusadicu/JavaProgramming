package day36_Inheritance.bookTask;

public class AudioBook extends Book {

    /*
    3.3 Create a subclass of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()
     */

    public String length;
    public String narrator;

    public void setInfo(String title, String type, String author, double price, String length, String narrator) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
        this.length = length;
        this.narrator = narrator;
    }

    public String toString() {
        return "AudioBook{" +
                "length='" + length + '\'' +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price= $" + price +
                '}';
    }

    public void listen(){
        System.out.println("I'm listening to "+title);
    }





}
