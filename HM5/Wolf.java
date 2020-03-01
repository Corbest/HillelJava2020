package ua.od.hillel;

public class Wolf extends Wild {
    public Wolf(int id, int age, int weight, String color) {
        super(id, age, weight, color,"Predator");
    }

    public static String getVoice() {
        return "I am a wild animal, and I am angry";
    }
}
