package HM18;


import static java.lang.Thread.*;

public class OS {
    public static void main(String[] args) throws InterruptedException {

        InPutUser inPutUser = new InPutUser();
        OutPutUser outPutUser = new OutPutUser();
        Thread threadOne = new Thread(inPutUser);
        Thread threadTwo = new Thread(outPutUser);
        threadOne.setPriority(MAX_PRIORITY);
        threadTwo.setPriority(MIN_PRIORITY);
        threadOne.start();
        threadTwo.start();
        threadTwo.sleep(500);
        while (threadOne.isAlive() | threadTwo.isAlive()) {
            sleep(1000);
        }
        System.out.println();
        Box.checkBox();
    }
}


