package ua.od.hillel;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(1,4,3,"Green");

        Dog dog = new Dog(2,6,43,"Dark");

        Fish fish = new Fish(3,2,3,"Blue");

        Hamster hamster = new Hamster(4,1,1,"Orange");

        Lion lion= new Lion(5,7,79,"Gold");

        Wolf wolf = new Wolf(6,10,75,"White");

        Crocodile crocodile = new Crocodile(7,30,200,"Green");

        Giraffe giraffe = new Giraffe(8,12,130,"Yellow");

        GuideDog guideDog = new GuideDog(9,7,45,"Black");

        System.out.println("======================================================");
        cat.getName();
        cat.isVaccinated();
        System.out.println(Cat.getVoice());
        System.out.println("======================================================");
        dog.getName();
        dog.isVaccinated();
        System.out.println(Dog.getVoice());
        System.out.println("======================================================");
        fish.getId();
        System.out.println(Fish.getVoice());
        System.out.println("======================================================");
        hamster.getName();
        System.out.println(Hamster.getVoice());
        System.out.println("======================================================");
        lion.getId();
        lion.getColor();
        System.out.println(lion.getIsPredator());
        System.out.println(Lion.getVoice());
        System.out.println("======================================================");
        wolf.getId();
        wolf.getWeight();
        System.out.println(Wolf.getVoice());
        System.out.println("======================================================");
        crocodile.getId();
        crocodile.getAge();
        System.out.println(Crocodile.getVoice());
        System.out.println("======================================================");
        giraffe.getId();
        giraffe.getColor();
        System.out.println(Giraffe.getVoice());
        System.out.println("======================================================");
        guideDog.getName();
        System.out.println(guideDog.isTrained());
        guideDog.getId();
        System.out.println(GuideDog.getVoice());
        guideDog.isVaccinated();
        guideDog.getGoHome();
        System.out.println("======================================================");
    }
}

