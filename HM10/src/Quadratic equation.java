
class Quadratic equation {

import java.util.Scanner;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Напишите первое значение: ");
        int one = sc.nextInt();
        System.out.print("Напишите второе значение: ");
        int two = sc.nextInt();
        System.out.print("Напишите третье значение: ");
        int three = sc.nextInt();
        magic(one,two,three);
    }
    public static void magic( int one,int two, int three ) {

        double res = Math.pow(two,2)-4*one*three;
        int tempVariable1;
        int tempVariable2;

        if (res == 0) {
            tempVariable1 = -two / (2*one);
            System.out.print("Дискриминант = ");
            System.out.printf("%.2f",res);
            System.out.println(" ");
            System.out.print("x = ");
            System.out.printf("%.2f",tempVariable1);

        } else if(res > 0) {

            tempVariable1 = (Math.sqrt(res) - two)/(2*one);
            tempVariable2 = (Math.sqrt(res)*(-1)-two)/(2*one);
            System.out.print("Дискриминант = ");
            System.out.printf("%.2f",res);
            System.out.println(" ");
            System.out.print("Переменная один = ");
            System.out.printf("%.2f  ",tempVariable1);
            System.out.print("Переменная два = ");
            System.out.printf("%.2f  ",tempVariable2);
        } else if (res < 0){
            System.out.println("Дискриминант < 0");
        }
    }
}