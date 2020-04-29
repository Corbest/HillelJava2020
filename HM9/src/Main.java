import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        LinkList test = new LinkList();
        test.add("ЙОу");
        linkList.addAll(test);
        String[] mass = new String[]{"Абв","Sбв"};
        linkList.add("Проверочка");
        linkList.add("Непроверочка");
        linkList.add("ТА ЗА ШО ?");
        linkList.displayList();
        System.out.println("\n"+linkList.size());
        System.out.println(linkList.contains(""));
        linkList.clear();
        linkList.add("Проверочка");
        linkList.addAll(mass);
        linkList.displayList();
//        System.out.println("\n"+linkList.size());

    }
}