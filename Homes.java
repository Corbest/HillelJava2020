package ua.od.hillel;

public class Homes extends Animal{
    protected boolean Vaccinated;
    protected String name;

    protected Homes(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color);
        this.name = name;
    }

    public boolean isVaccinated() {
        System.out.println("Im Vaccinated");
        return Vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.Vaccinated = vaccinated;
    }

    public void getName() {
        System.out.println("my name is "+name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
