import java.util.Arrays;

public class Collect {
 int sizeInMass = 10;
 private String[] mass = new String[sizeInMass];
 private String[] tempMass;
 int size = 0;

 public void add(String set) {
  if (size == mass.length) {
   sizeInMass = mass.length;
   tempMass = new String[sizeInMass];
   System.arraycopy(mass,0,tempMass,0,mass.length);
   mass = new String[(mass.length * 3) /2 + 1];
   System.arraycopy(tempMass,0,mass,0,size);
  }
  if (size < mass.length) {
   mass[size] = set;
   size++;
  }
 }

 public void delete(int del) {
  if (del<0){
   throw new IndexOutOfBoundsException("Index out of bounds");
  }
   int forward = mass.length - del -1;
   System.arraycopy(mass,del + 1,mass, del,forward);
   mass[--size] = null;
  }

 public void getIndex(int get) {
  if (get < size) {
   System.out.println("Элемент по данному индексу: " + mass[get]);

  } else System.out.println("Такого индекса нету.");

  if (mass[get] == null)
   System.out.println("ячейка пустая");
 }

 public boolean contains(String get) {
   boolean result = false;
  for (String value : mass) {
   if (get.equalsIgnoreCase(value)) {
    result = true;
    break;
   }
  }
  return result;
 }

 public boolean equals(Collect collections) {
  
  return true;
 }

 public void clear() {
  for (int i = 0; i < size; i++) {
   mass[i] = null;
  }
  size = 0;
  System.out.println("Массив очищен");
 }

 public void indexOf(String find) {
  int result  = -1;
  for (int i = 0; i < mass.length; i++) {
   if (find.equalsIgnoreCase(mass[i])) {
    result = i; break;
   }
  }
  System.out.println("Индекс элемента: "+result);
 }

    public void  getSize () {
     System.out.println("Размер массива: " + size);
    }
   public void check() {
     System.out.println(Arrays.toString(mass));
    }
}
