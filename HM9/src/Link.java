public class Link {
        String str;
        String[] strArr;

        Link next;
        Link prev;

    public void displayLink() {
        System.out.print("{" + str + "} ");
    }
        public Link(String str) {
            this.str = str;
        }
    }
