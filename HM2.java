import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        Numbers(); // Задание 1
        System.out.println("\n====================");
        System.out.println("Задание №2\n" + Factorial(10) + "\n===================="); // задание 2
        System.out.println("Задание №3");
        NumbersWhile(); // Задание 3
        System.out.println("\n" + FactorialWhile(10) + "\n====================");
        System.out.println("Задание №4");
        NumbersDoWhile(); // Задание 4
        System.out.println("\n" + FactorialDoWhile(10) + "\n====================");
        System.out.println("Задание №5");
        Pow();
        System.out.println("====================");
        System.out.println("Задание №6");
        OutNumber();
        System.out.println("\n====================");
        System.out.println("\nЗадание №8");
        Random();
        System.out.println("\n====================");
        System.out.println("Задание №9,10,11,12");
        numberMin();
        System.out.println("\n====================");
        numberMax();
        System.out.println("\n====================");
        sumArrays();
        System.out.println("\n====================");
        matrix();
        System.out.println("\n====================");
        System.out.println("Задание №7");
        System.out.println("Введите число: ");
//        Scanner sc = new Scanner(System.in); // Так яписал раньше
//        int number = sc.nextInt();
        int number = new Scanner(System.in).nextInt(); // Я увидел новую запись для се6я)))
        Table(number);


    }

    public static void Numbers() { //Задание 1
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) { // если число i делится на 2 с остатком то вывести это число.
                System.out.print(i + ",");
            }
        }
    }

    public static int Factorial(int n) { // Задание 2
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void NumbersWhile() {
        int num = 0;
        while (num < 100) {
            num++;
            if (num % 2 != 0) {
                System.out.print(num + ",");
            }
        }
    }

    public static int FactorialWhile(int n) {
        int result = 1;
        int NatureNumb = 1;
        while (NatureNumb < n) {
            NatureNumb++;
            result *= NatureNumb;
        }
        return result;
    }

    public static void NumbersDoWhile() {
        int num = 0;
        do {
            num++;
            if (num % 2 != 0)
                System.out.print(num + ",");
        } while (num < 100);
    }

    public static int FactorialDoWhile(int n) {
        int result = 1;
        int NatureNumb = 1;
        do {
            NatureNumb++;
            result *= NatureNumb;
        } while (NatureNumb < n);
        return result;
    }

    public static void Pow() {
        int a = 5;
        int b = 3;
        System.out.println("Число A: " + a + "\nЧисло B: " + b);
        System.out.println("Число A в степени числа B: " + Math.pow(a, b));
    }

    public static void OutNumber() {
        int[] mass = {0, -5, -10, -15, -20, -25, -30, -35, -40, -45, -50};
        for (int i = 0; i < 10; i++) {
            System.out.print(mass[i] + ",");
        }
    }

    public static void Table(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    public static void Random() {
        int[] array = {1, 5, 7, 3, 13, 9, 15, 21, 17, 47, 10, 20, 50, 24, 55};
        for (int i = 0; i < 10; i++) {
//            array[i] = i * 2+1;
            System.out.print(array[i] + ",");
        }
    }

    public static void numberMin() {
        int[] array = {5, 4, 7, 23, 68, 92, 10, 3, 6, 4, 5, 34, 13, 732};
        int min = array[0];
        for (int i : array) {
            if (min > i)
                min = i;
        }
        System.out.print("Минимальное число: " + min);
    }

    public static void numberMax() {
        int[] array = {5, 4, 7, 23, 68, 92, 10, 3, 6, 4, 5, 34, 13, 732};
        int max = array[0];
        for (int i : array) {
            if (max < i)
                max = i;
        }
        System.out.print("\nМаксимальное число: " + max);
    }

    public static void sumArrays() {
        int[] array = {5, 4, 7, 23, 68, 92, 10, 3, 6, 4, 5, 34, 13, 732};
        int result = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            counter++;
        }
        System.out.println("\nСреднее арифметическое элементов массива.\n" + (result / counter));
    }

    public static void matrix() {
        String [][] Desk = new String[8][8];
        for (int i = 0; i < Desk.length; i++) {
            for (int j = 0; j < Desk[0].length; j++) {
                if ((i + j) % 2 == 0)
                    Desk[i][j] = "W";
                else
                    Desk[i][j] = "B";
                System.out.print("  "+Desk[i][j]);
            }
            System.out.println();
        }
    }
}