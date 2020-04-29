
public interface CustomCollection {
    boolean add(String str);

    boolean addAll(String[] strArr);

    boolean addAll(LinkList strColl);

    boolean delete (int index);

    Link delete (String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int getSize();

    boolean trim();

    boolean compare(LinkList coll);
}
