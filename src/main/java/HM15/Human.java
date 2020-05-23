package HM15;

import java.util.Scanner;

public class Human {
    private final Scanner inputScanner;

    public Human() {
        inputScanner = new Scanner(System.in);
    }

    public Move getMove() {
        System.out.print("Камень, ножницы или бумага? ");

        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        char firstLetter = userInput.charAt(0);
        if (firstLetter == '1' || firstLetter == '2' || firstLetter == '3') {

            switch (firstLetter) {
                case '1':
                    return Move.ONE;
                case '2':
                    return Move.TWO;
                case '3':
                    return Move.THREE;
            }
        }
        return getMove();
    }

    public boolean playAgain() {
        System.out.print("Хотите сыграть еще раз? ");
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Д';
    }
}
