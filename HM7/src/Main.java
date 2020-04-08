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
        collect.indexOf("Проверка");
        collect.contains("");
        collect.equals();
//        collect.clear();
        System.out.println(collect.getSize());
    }
}
