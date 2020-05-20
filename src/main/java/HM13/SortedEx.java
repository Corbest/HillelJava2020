package HM13;

public class SortedEx {
    public static void main(String[] args) {
        //Бинарный поиск
        int maxSize = 5;
        int[] myArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        BinaryFind binaryFind = new BinaryFind();
        System.out.println("Бинарная");
        System.out.println(binaryFind.find(myArray, 5, 0, myArray.length-1));
        //Бинарный поиск
//=====================================================================================================================
        //Сортировка пузырьком
        System.out.println("Пузырьком");
        SortedBub sortedBub = new SortedBub(maxSize);
        sortedBub.insert(11);
        sortedBub.insert(12);
        sortedBub.insert(23);
        sortedBub.insert(76);
        sortedBub.insert(30);
        sortedBub.display();
        sortedBub.bubbleSort();
        sortedBub.display();
        //Сортировка пузырьком
//=====================================================================================================================
        //Сортировка методом вставки
        System.out.println("Вставка");
        SortedIns sortedIns = new SortedIns(maxSize);
        sortedIns.insert(11);
        sortedIns.insert(1);
        sortedIns.insert(8);
        sortedIns.insert(74);
        sortedIns.insert(4);
        sortedIns.display();
        sortedIns.insertSort();
        sortedIns.display();
        //Сортировка методом вставки
//=====================================================================================================================
        //интерполяционный поиск
        System.out.println("интерполяционный");

        System.out.println(Search_Interpolation.search_Interpolation(myArray,6));
        //интерполяционный поиск
//=====================================================================================================================

    }
}
