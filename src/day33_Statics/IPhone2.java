package day33_Statics;

public class IPhone2 {

    public String model, price, color, size;
    public static String brand = "Apple";
    public static String OS = "iOS";
    public static String madeIn = "China";

    public IPhone2(String model, String price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public static void faceTime(long phoneNumber){
        System.out.println("FaceTime");
    }

    public static void faceTime(String email){
        System.out.println("FaceTime");
    }

    public void call(long phoneNumber){
        System.out.println("Phone Call");
    }

    public void text(long phoneNumber){
        System.out.println("Text message");
    }

    public String toString() {
        return "IPhone2{" +
                "model='" + model + '\'' +
                ", price= $" + price + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
4. IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */