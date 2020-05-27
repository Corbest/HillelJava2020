package HM18;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OS {
    public static void main(String[] args) {

        Box box = new Box();
        InPutUser inPutUser = new InPutUser();
        OutPutUser outPutUser = new OutPutUser();

            while (box.fullness < box.MAX_FULLNESS) {
                int set = inPutUser.inPutInBox();
                System.out.println(inPutUser.name + ": " + box.check());
                box.inPutInBox(set);

            System.out.println(inPutUser.name + ": " + box.check());
        }
        while (box.fullness > box.MIN_FULLNESS) {
                int set = outPutUser.outPutInBox();
                System.out.println(outPutUser.name + ": " + box.check());
                box.inPutInBox(set);
            }
            System.out.println(outPutUser.name + ": " + box.check());
        }
    }


