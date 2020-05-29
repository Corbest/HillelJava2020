package HM18;
import java.util.Random;

import static java.lang.Thread.sleep;

public class  InPutUser implements Runnable {
    public String name = "Fred";
    public static int timeInPutUser = 1000;

    @Override
    public  void run() {
            while (!Box.isFull()) {
                try {
                    sleep(timeInPutUser);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int current = Box.getCurrent();
                Box.trim();
                Random rnd = new Random();

                Box.fullness[current] = rnd.nextInt(14);


                Box.trim();
                System.out.print("" + getNameOfUser() + " - ");
                Box.checkBox();
                Box.setCurrent(Box.getCurrent() + 1);
                Box.trim();


            }
            if (Box.isFull()) {
                System.out.println("Box is Full");
                System.out.print("" + getNameOfUser() + " - ");
                Box.checkBox();
                OutPutUser.timeOutPutUser = 1000;
                timeInPutUser = 3000;
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Box.trim();
                run();
            }
        }
        public String getNameOfUser() {
            return name;
        }
    }
