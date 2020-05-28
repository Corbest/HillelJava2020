package HM18;

//public class User_In_Out implements Runnable {
//    private Box box;
//    String name;
//
//    @Override
//    public void run() {
//        while (box.check() != box.MAX_FULLNESS) {
//            int set = inPutInBox();
//            System.out.println(name + ": " + box.check());
//            box.setInBox(set);
//        }
//        System.out.println(name + ": " + box.check());
//
//        while (box.check() != box.MIN_FULLNESS) {
//            int set = outPutInBox();
//            System.out.println(name + ": " + box.check());
//            box.setInBox(set);
//        }
//        System.out.println(name + ": " + box.check());
//    }
//
//    public void setBox (Box box){
//        this.box = box;
//    }
//    public void setUserName (String name){
//        this.name = name;
//    }
//    public int inPutInBox() {
//        return 100;
//    }
//    public int outPutInBox() {
//        return -100;
//    }
//}
