package HM18;


import static java.lang.Thread.*;

public class OS {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        InPutUser inPutUser = new InPutUser();
        inPutUser.setBox(box);
        OutPutUser outPutUser= new OutPutUser();
        outPutUser.setBox(box);
        Thread one = new Thread(inPutUser);
        Thread two = new Thread(outPutUser);
        one.setPriority(MAX_PRIORITY);
        two.setPriority(MIN_PRIORITY);
        one.start();
        two.start();


//            while (box.fullness < box.MAX_FULLNESS) {
//                int set = inPutUser.inPutInBox();
//                System.out.println(inPutUser.name + ": " + box.check());
//                box.inPutInBox(set);
//
//            System.out.println(inPutUser.name + ": " + box.check());
//        }
//        while (box.fullness > box.MIN_FULLNESS) {
//                int set = outPutUser.outPutInBox();
//                System.out.println(outPutUser.name + ": " + box.check());
//                box.inPutInBox(set);
//            }
//            System.out.println(outPutUser.name + ": " + box.check());
//        }
    }
}


