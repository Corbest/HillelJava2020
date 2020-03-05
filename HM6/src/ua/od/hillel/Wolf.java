package ua.od.hillel;

public class Wolf implements Animal,Wild,GiveInfo,GiveVoice  {
    private int id;
    private int age;
    private int weight;
    private String color;
    private String predator = "predator";

    public Wolf(int id, int age, int weight, String color, String predator) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.predator = predator;
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
        getPredator();
        Say();
    }
    @Override
    public void getPredator() {
        System.out.println("im is: "+this.predator);
    }

    @Override
    public void Say() {
        System.out.println("I am a wild animal");
    }
}
