package HM12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        List<String> fistList = Arrays.asList("Дин","Дон","Загорелся","Чей-то","Дом");
        List<Pair> secondList = fistList.stream()
                .map(e -> new Pair(e,e.toUpperCase()))
                .collect(Collectors.toList());
        System.out.println(secondList);
    }
}
