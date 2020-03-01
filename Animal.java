package ua.od.hillel;

public class Animal {
    protected int id;
    protected int age;
    protected int weight;
    protected String color;

    protected Animal(int id, int age, int weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public static String getVoice() {
        return "Hello";
    }

    public void getId() {
        System.out.println("My id: " +id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getAge() {
        System.out.println("My age: "+age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getWeight() {
        System.out.println("My Weight: "+weight);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void getColor() {
        System.out.println("My color: "+color);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
