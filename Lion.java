package ua.od.hillel;

public class Lion extends Wild {
    public Lion(int id, int age, int weight, String color) {
        super(id, age, weight, color,"Predator");
    }

    public static String getVoice() {
        return "I am a wild animal, and I am angry";
    }
}
