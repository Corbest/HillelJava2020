package HM18;

public class Box {
    public volatile int fullness;
    public volatile int MAX_FULLNESS = 1000;
    public volatile int MIN_FULLNESS = 0;

    public int check() {
        return fullness;
    }
    public void setInBox(int value) {
        fullness += value;
    }
    public boolean isEmpty() {
        return this.fullness == MIN_FULLNESS;
    }
    public boolean isFull() {
        return this.fullness == MAX_FULLNESS;
    }
}
