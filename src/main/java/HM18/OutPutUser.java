package HM18;

public class OutPutUser implements Runnable{
    private Box box;
    public String name = "Jam";

    public int outPutInBox() {
        return -100;
    }
    public void setBox(Box box){
        this.box = box;
    }
    @Override
    public void run() {
        while (box.fullness > box.MIN_FULLNESS) {
            int set = outPutInBox();
            System.out.println(name + ": " + box.check());
            box.setInBox(set);
        }
        System.out.println(name + ": " + box.check());
    }
}

