package HM4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToyotaSupra ToyotaSupra = new ToyotaSupra();
        System.out.println("Вы сели в машину.\nВы можете : \n1)Проверить бак\n2)Заполнить бак\n3)Поехать в Кривое Озеро");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            switch (sc.nextLine()) {
                case "Проверить бак":
                    ToyotaSupra.checkTank();
                    break;
                case "Заполнить бак":
                    ToyotaSupra.howFuelNeed();
                    ToyotaSupra.addFuelInTank();
                    System.out.println("\n3)Поехать в Кривое Озеро");
                    break;
                case "Поехать в Кривое Озеро":
                    ToyotaSupra.Krivoe();
                    if (ToyotaSupra.Fuel() <= 0) {
                        System.out.println("Попро6уйте заправить машину\n1)Проверить бак\n2)Заполнить бак\n3)Поехать в Кривое Озеро");
                    }else
                        flag = false;
                    break;
                default:
                    System.out.println("Нет такой возможности.");
                    System.out.println("Попро6уй ещё раз:\n1)Проверить бак\n2)Заполнить бак\n3)Поехать в Кривое Озеро");
                    break;
            }
        }
        System.out.println("\nВы можете : \n1)Проверить бак\n2)Заполнить бак\n3)Поехать в Жашков");
        flag = true;
        while (flag) {
            switch (sc.nextLine()) {
                case "Проверить бак":
                    ToyotaSupra.checkTank();
                    break;
                case "Заполнить бак":
                    ToyotaSupra.howFuelNeed();
                    ToyotaSupra.addFuelInTank();
                    System.out.println("\n3)Поехать в Жашков");
                    break;
                case "Поехать в Жашков":
                    ToyotaSupra.Jahkov();
                    if (ToyotaSupra.Fuel() <= 0) {
                        System.out.println("Попро6уйте заправить машину\n1)Проверить бак\n2)Заполнить бак\n3)Поехать в Жашков");
                    }else
                        flag = false;
                    break;
                default:
                    System.out.println("Нет такой возможности.");
                    System.out.println("Попро6уй ещё раз:\n1)Проверить бак\n2)Заполнить бак\n3)Поехать в Кривое Озеро");
                    break;
            }
        }
        System.out.println("\nВы можете : \n1)Проверить бак\n2)Заполнить бак\n3)Поехать в Киев");
        flag = true;
        while (flag) {
            switch (sc.nextLine()) {
                case "Проверить бак":
                    ToyotaSupra.checkTank();
                    break;
                case "Заполнить бак":
                    ToyotaSupra.howFuelNeed();
                    ToyotaSupra.addFuelInTank();
                    System.out.println("Поехать в Киев");
                    break;
                case "Поехать в Киев":
                    ToyotaSupra.Jahkov();
                    if (ToyotaSupra.Fuel() <= 0) {
                        System.out.println("Попро6уйте заправить машину\n1)Проверить бак\n2)Заполнить бак\n3)Поехать в Киев");
                    }else
                        flag = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Нет такой возможности.");
                    System.out.println("Попро6уй ещё раз:\n1)Проверить бак\n2)Заполнить бак\n3)Поехать в Киев");
                    break;
            }
        }
    }
}
