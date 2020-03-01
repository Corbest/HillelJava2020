package ua.od.hillel;

public class Wild extends Animal{
    protected String  isPredator;

    protected Wild(int id, int age, int weight, String color, String isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public String getIsPredator() {
        return isPredator;
    }

    public void setIsPredator(String isPredator) {
        this.isPredator = isPredator;
    }
}
