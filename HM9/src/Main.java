public class Main {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        LinkList test = new LinkList();
        String[] mass = new String[]{"2","4","5"};
//        test.add("1");
        test.add("1");
        linkList.addAll(mass);
        linkList.addAll(test);
        linkList.add("1");
        linkList.add("1");
        linkList.displayList();
        System.out.println();
        System.out.println(linkList.get(0));
        System.out.println(linkList.get(1));
        System.out.println(linkList.get(2));
        System.out.println(linkList.get(3));
        System.out.println(linkList.get(4));
        System.out.println(linkList.compare(test));
//        linkList.clear();
        linkList.delete(2);
        linkList.delete("4");
        linkList.displayList();
    }
}