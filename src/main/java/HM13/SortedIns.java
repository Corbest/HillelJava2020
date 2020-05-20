package HM13;

public class SortedIns {
    private long []a;
    private int count;

    public SortedIns(int max) {
        a = new long[max];
        count = 0;
    }
    public void insert(long value) {
        a[count] = value;
        count++;
    }
    public void display() {
        for (int j = 0; j < count; j++)
            System.out.println(a[j]);
        System.out.println();
    }
    public void insertSort() {
    int in,out;
        for (out = 1; out <count ; out++) {
            long temp = a[out];
            in = out;
            while (in>0 && a[in-1] >= temp) {
                a[in] = a[in-1];
                in--;
            }
            a[in] = temp;
        }
    }
}
