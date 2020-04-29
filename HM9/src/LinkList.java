import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkList implements CustomCollection {
    private Link first;
    private Link last;
    private int size = 0;
    public  LinkList() {

    }

    public boolean isEmpty() {
        return (first == null);
    }


    public boolean displayList() {
        System.out.println("List (first --> last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }return true;
    }

    public boolean add(String str) {
        Link newLink = new Link(str);
        if (isEmpty()) {
            last = newLink;
            first = newLink;
        } else {
            Link current = last;
            newLink.next = null;
            last = newLink;

            newLink.prev = current;
            current.next = newLink;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (String s : strArr) {
            Link newLink = new Link(s);
            if (isEmpty()) {
                last = newLink;
                first = newLink;
            } else {
                Link current = last;
                newLink.next = null;
                last = newLink;

                newLink.prev = current;
                current.next = newLink;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(LinkList strColl) {
        for (int i = 0; i < strColl.size(); i++) {
            String value = strColl.get(i);
            Link newLink = new Link(value);
            if (isEmpty()) {
                last = newLink;
                first = newLink;
            }else  {
                Link current = last;
                newLink.next = null;
                last = newLink;

                newLink.prev = current;
                current.next = newLink;
            }
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
        Link current = first;
        Link previous = first;
        int count = 0;
        while (count != index) {
            if (current.next == null)
                return false;
            else {
                previous = current;
                current = current.next;
                count++;
            }
        }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
        size--;
        return true;
    }

    public Link delete(String str) {
        Link current = first;
        Link previous = first;

        while (!current.str.equals(str)) {
            if (current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
        size--;
        return current;
    }

    @Override
    public String get(int index) {
        Link current = first;
        for (int i = 0; i <= index; i++) {
            if (current.next == null)
                return null;
            else current = current.next;
        }
        return current.str;
    }

    @Override
    public boolean contains(String str) {
        Link current = first;
        while (!current.str.equals(str)) {
            current = current.next;
            if (current == null)
                return false;
        }
        return true;
    }

    @Override
    public boolean clear() {
        System.out.println("Цепочка пустая");
        while (!isEmpty()) {
            if (first.next == null)
                first = null;
            else
                last.prev.next = null;
                last = last.prev;
            }
        return true;
    }
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public boolean compare(LinkList coll) {
        return false;
    }
}
