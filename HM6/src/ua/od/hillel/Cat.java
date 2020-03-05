package ua.od.hillel;

public class Cat implements Animal,Home,GiveInfo,GiveVoice{
    private int id;
    private int age;
    private int weight;
    private String  color;
    private String  name;

    public Cat(int id, int age, int weight, String color, String name) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.name = name;
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
    public void getName() {
        System.out.println("My name is: "+this.name);
    }
    @Override
    public void getVaccinated() {
        String vaccinated = "vaccinated";
        System.out.println("Im is: "+vaccinated);
    }

    @Override
    public void ShowInfo() {
        getId();
        getName();
        getWeight();
        getAge();
        getColor();
        getVaccinated();
        Say();
    }

    @Override
    public void Say() {
        System.out.println("Meow");
    }
}
