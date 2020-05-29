package HM18;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Thread.sleep;

public class OutPutUser implements Runnable{
    public String name = "Jam";
    static List<Integer> outPutList = new ArrayList<>(10);
    public static int timeOutPutUser = 3000;

    @Override
    public void run() {
        while(!Box.isEmpty()){
            try {
                sleep(timeOutPutUser);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int current = 0;
            outPutList.add(Box.fullness[current]);
            Box.fullness[current] = null;
            Box.trim();



            Box.trim();
            System.out.print(""+getNameOfUser()+" - ");
            Box.checkBox();
            System.out.println("Out put List " +outPutList);
            Box.setCurrent(Box.getCurrent()-1);
            Box.trim();

        }
        if(Box.isEmpty()){
            System.out.println("Box is Empty");
            System.out.print("" + getNameOfUser() + " - ");
            Box.checkBox();
            OutPutUser.timeOutPutUser = 1000;
            timeOutPutUser = 3000;
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

