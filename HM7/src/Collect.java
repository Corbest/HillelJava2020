public class Collect {

   private String [] mass = new String[10];
   int size = 0;

    public void add (String set) {
      mass[size] = set;
      size++;
    }
    public void delete (int del) {
     if (del < 10) {
      this.mass[del] = null;
      size--;
     }else System.out.println("Такого индекса нету");
    }
    public void getIndex (int get) {
     if (get < 10) {
      System.out.println(mass[get]);
     }else System.out.println("Такого индекса нету.");

     if (mass[get] == null)
      System.out.println("ячейка пустая");
    }
    public void contains (int get) {

    }

    public void equals () {

    }
    public void clear () {
     for (int i = 0; i < size; i++) {
      mass[i] = null;
     }
     size = 0;
    }
    public void findOrIndexOf () {

    }
    public int getSize () {
     return size;
    }
}
