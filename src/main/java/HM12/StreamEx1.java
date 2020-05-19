package HM12;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class StreamEx1 {
    public static void main(String[] args) {
        List <Integer> test = Arrays.asList(1,2315,123,23,5,765,13);
        double average = test.stream()
                .mapToInt(e -> e)
                .summaryStatistics().getAverage();
        System.out.println(average);

    }
}
