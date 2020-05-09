import java.util.Collection;
import java.util.HashSet;

public class Duplicates {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
