package HM18;

public class InPutUser implements Runnable {
    private Box box;
    public String name = "Fred";

    public int inPutInBox() {
        return 100;
    }
    public void setBox(Box box){
        this.box = box;
    }

    @Override
    public void run() {
        while (box.fullness < box.MAX_FULLNESS) {
            int set = inPutInBox();
            System.out.println(name + ": " + box.check());
            box.setInBox(set);
        }
        System.out.println(name + ": " + box.check());
    }
}
