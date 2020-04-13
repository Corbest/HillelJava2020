import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Collect collect = new Collect();
        collect.getSize();
        collect.check();
        System.out.println("===========================");
        collect.add("1");
        collect.add("2");
        collect.add("Проверка");
        collect.add("тест4");
        collect.add("тест5");
        collect.add("тест6");
        collect.add("тест7");
        collect.add("тест8");
        collect.add("тест9");
        collect.add("тест10");
        collect.add("тест11");
        collect.add("тест12");
        collect.add("тест13");
        collect.add("тест14");
        collect.add("тест15");
        collect.add("тест16");
        collect.check();
        System.out.println("===========================");
        collect.getSize();
        collect.delete(4);
        System.out.println("===========================");
        collect.getIndex(10);
        System.out.println("===========================");
        collect.indexOf("Проверка");
        System.out.println("===========================");
        System.out.println(collect.contains("100"));
        System.out.println(collect.equals(collect));
//        collect.clear();
        System.out.println("===========================");
        collect.check();
        collect.getSize();
    }
}
