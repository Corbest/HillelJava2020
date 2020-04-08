public class Collect {

 private String[] mass = new String[10];
 int size = 0;

 public void add(String set) {
  if (size < mass.length) {
   mass[size] = set;
   size++;
  }
  else System.out.println("Мест нет");
 }

 public void delete(int del) {
  if (del < size) {
   this.mass[del] = null;
   size--;
  } else System.out.println("Такого индекса нету");

 }

 public void getIndex(int get) {
  if (get < size) {
   System.out.println(mass[get]);
  } else System.out.println("Такого индекса нету.");

  if (mass[get] == null)
   System.out.println("ячейка пустая");
 }

 public void contains(String get) {

 }

 public void equals() {

 }

 public void clear() {
  for (int i = 0; i < size; i++) {
   mass[i] = null;
  }
  size = 0;
 }

 public int indexOf(String find) {
  int result  = -1;
  for (int i = 0; i < mass.length; i++) {
   if (find.equalsIgnoreCase(mass[i])) {
    result = i; break;
   }
  }
  return result;
 }

    public int getSize () {
     return size;
    }
}
