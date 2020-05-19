package HM12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamEx3 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Слова","Из","пяти","букв","которыЕ","нуЖны","ДЛЯ","зАдАнИя");
        Predicate<String> myLowerList = (s -> s.equals(s.toLowerCase()) && s.length() == 4);
        myList.stream()
                .filter(myLowerList)
                .forEach(System.out::println);
    }
}
