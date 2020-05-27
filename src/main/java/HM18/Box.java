package HM18;

public class Box {
    public int fullness;
    public int MAX_FULLNESS = 1000;
    public int MIN_FULLNESS = 0;

    public int check() {
        return fullness;
    }
    public void setInBox(int value) {
        this.fullness += value;
    }
}
