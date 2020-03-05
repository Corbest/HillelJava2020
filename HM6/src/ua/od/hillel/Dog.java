package ua.od.hillel;

public class Dog implements Animal,Home,GiveInfo {

    @Override
    public void getId() {
        int id = 2;
        System.out.println("My id is : "+ id);
    }
    @Override
    public void getAge() {
        int age = 6;
        System.out.println("My  age is: "+ age);
    }
    @Override
    public void getWeight() {
        int weight = 15;
        System.out.println("My  weight is: "+ weight);
    }
    @Override
    public void getColor() {
        String color = "Black";
        System.out.println("My  color is: "+ color);
    }
    @Override
    public void getName() {
        String name = "Sof";
        System.out.println("My  name is: "+ name);
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
    }
}

