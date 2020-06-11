import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] integer = new Integer[5];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        integer[3] = 4;
        integer[4] = 16;
        ArrayIterator arrayIterator = new ArrayIterator(integer);

        while (arrayIterator.hasNext()) {
            Integer i =(Integer) arrayIterator.next();
            System.out.println(i);
        }
        System.out.println("================================");
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("1");
        set.add("2");
        set.add("3");
        System.out.println("Проверка");
        System.out.println(Duplicates.removeDuplicates(set));


        }
    }
