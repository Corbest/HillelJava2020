package HM18;

public class  InPutUser implements Runnable {
    private Box box;
    public String name = "Fred";

    public int inPutInBox() {
        return 100;
    }
    public void setBox(Box box){
        this.box = box;
    }

    @Override
    public synchronized void run() {
        if (box.isEmpty())
            while (box.check() != box.MAX_FULLNESS) {
                int set = inPutInBox();
                System.out.println(name + ": " + box.check());
                box.setInBox(set);
            }
            System.out.println(name + ": " + box.check());
        }
    }
