package HM13;

public class SortedBub {

    private long[] a;
    private int count;

    public SortedBub(int max) {
        a = new long[max];
        count = 0;
    }
    public void insert(long value) {
        a[count] = value;
        count++;
    }
    public void display() {
        for(int j=0; j<count; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }
    public void bubbleSort() {
        int out, in;
        for(out=count-1; out>1; out--)
            for(in=0; in<out; in++)
                if( a[in] > a[in+1] )
                    swap(in, in+1);
    }
    public void swap(int one,int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}

