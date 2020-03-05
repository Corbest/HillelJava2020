package ua.od.hillel;

public class Main {

    public static void main(String[] args) {
        GiveInfo info = new Cat(1,3,7,"Yellow","Cat");
        GiveInfo info1 = new Dog();
        GiveInfo info2 = new Crocodile(3,3,7,"Yellow","predator");
        GiveInfo info3 = new Wolf(4,3,7,"Yellow","predator");
        GiveInfo info4 = new Lion(5,3,7,"Yellow","predator");
        GiveInfo info5 = new Fish(6,3,7,"Yellow");
        GiveInfo info6 = new Hamster(7,3,7,"Yellow","Hamster");
        GiveInfo info7 = new GuideDog(8,3,7,"Yellow","GuideDog");
        GiveInfo info8 = new Giraffe(9,3,7,"Yellow");

        info.ShowInfo();
        System.out.println("=======================================");
        info1.ShowInfo();
        System.out.println("=======================================");
        info2.ShowInfo();
        System.out.println("=======================================");
        info3.ShowInfo();
        System.out.println("=======================================");
        info4.ShowInfo();
        System.out.println("=======================================");
        info5.ShowInfo();
        System.out.println("=======================================");
        info6.ShowInfo();
        System.out.println("=======================================");
        info7.ShowInfo();
        if (info7 instanceof Trained )
            ((Trained)info7).trained();
        System.out.println("=======================================");
        info8.ShowInfo();
        System.out.println("=======================================");
    }
}
