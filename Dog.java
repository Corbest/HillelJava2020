package ua.od.hillel;

public class Dog extends Homes {

    public Dog(int id, int age, int weight, String color) {
        super(id, age, weight, color, "Dog");
    }

    public static String getVoice() {
        return "Woof";
    }
}
