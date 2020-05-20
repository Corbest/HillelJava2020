package HM13;

public class BinaryFind {

    public  int find(int[] sortedArray, int value, int first, int last) {
        int mid;
        while (true) {
            mid = (first + last) / 2;
            if (sortedArray[mid] == value) {
                return mid;
            } else if (first > last)
                return sortedArray.length;
            else {
                if (sortedArray[mid] < value)
                    first = mid + 1;
                else
                    last = mid - 1;
            }
        }
    }
}
