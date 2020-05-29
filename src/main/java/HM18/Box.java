package HM18;

public class Box {

    static Integer[] fullness = new Integer[10];
    static Integer indexOfLast = fullness.length - 1;

    static private int current = 0;

    public static int getCurrent() {
        return current;
    }

    public synchronized static void setCurrent(int current) {
        Box.current = current;
    }

    public static boolean isEmpty() {
        for (int i = 0; i <= indexOfLast; i++) {
            if (fullness[i] != null)
                return false;
        }
        return true;
    }

    public static boolean isFull() {
        for (int i = 0; i <= indexOfLast; i++) {
            if (fullness[i] == null)
                return false;
        }
        return true;
    }

    public static synchronized void checkBox() {
        for (int i = 0; i < Box.fullness.length; i++) {
            System.out.println("Вещей в коробке: " + Box.fullness[i]);
        }
    }

    public static void trim() {
        for (int i = fullness.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; ++j) {
                if (fullness[j] == null) {
                    Integer temp = fullness[j];
                    fullness[j] = fullness[j + 1];
                    fullness[j + 1] = temp;
                }
            }
        }
    }
}