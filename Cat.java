package ua.od.hillel;

public class Cat extends Homes {

public Cat(int id, int age, int weight, String color) {
    super(id,age,weight,color,"Cat");
}

    public static String getVoice() {
        return "Meow";
    }
}
