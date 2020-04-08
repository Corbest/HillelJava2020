public class Main {
    public static void main(String[] args) {
        Collect collect = new Collect();
        System.out.println(collect.getSize());
        collect.add("1");
        collect.add("2");
        collect.add("Проверка");
        collect.add("3");
        collect.add("3");
        collect.add("3");
        collect.add("3");
        collect.add("3");
        collect.add("3");
        collect.add("10");
        System.out.println(collect.getSize());
        collect.delete(4);
        collect.getIndex(2);
        System.out.println(collect.indexOf("Проверка"));
        System.out.println(collect.contains("100"));
        collect.equals();
//        collect.clear();
        System.out.println(collect.getSize());
    }
}
