package HM17;

import lombok.SneakyThrows;

import java.util.logging.Level;
import java.util.logging.Logger;

public class User extends Bank implements Runnable {
    private final String name;

    public User(String name) {
        this.name = name;
    }
    @SneakyThrows
    @Override
    public void run() {
        try {
        User user1 = new User("");
        while (user1.check() < user1.max_size) {
            System.out.println(name + " Положил в банкомат: " + user1.inPutForBank(100) + " денег");
            Thread.sleep(1000);
            System.out.println(name + " Снял с банкомата: " + user1.outPutForBank(50) + " денег");
            Thread.sleep(1000);
            Thread.sleep(3000);
            System.out.println("В банкомате сейчас: " + user1.check() + " денег");
        }
        } catch (InterruptedException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
