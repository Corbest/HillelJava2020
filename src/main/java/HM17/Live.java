package HM17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Live {
    public static void main(String[] args) {
    User user1 = new User("Corbest");
    User user2 = new User("Akademik");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(user1);
        executorService.submit(user2);
    }
}

