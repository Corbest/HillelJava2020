package ua.od.hillel;

public class Giraffe implements Animal,GiveInfo,GiveVoice{
    private int id;
    private int age;
    private int weight;
    private String color;

    public Giraffe(int id, int age, int weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public void getId() {
        System.out.println("My id is : "+this.id);
    }
    @Override
    public void getAge() {
        System.out.println("My age is: "+this.age);
    }
    @Override
    public void getWeight() {
        System.out.println("My weight is: "+this.weight);
    }
    @Override
    public void getColor() {
        System.out.println("My color is: "+this.color);
    }
    @Override
    public void ShowInfo() {
        getId();
        getWeight();
        getAge();
        getColor();
        Say();
    }

    @Override
    public void Say() {
        System.out.println("Hello");
    }
}
