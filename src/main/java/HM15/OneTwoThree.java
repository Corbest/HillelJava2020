package HM15;

public class OneTwoThree {
    private final Human human;
    private final Computer computer;
    private int userScore;
    private int computerScore;
    private int numberOfGames;
    public OneTwoThree() {
        human = new Human();
        computer = new Computer();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }
    public void startGame() {
        System.out.println("ONE, TWO, THREE!");
        Move humanMove = human.getMove();
        Move computerMove = computer.getMove();
        System.out.println("\nВаш ход  " + humanMove + ".");
        System.out.println("Ход компьютера  " + computerMove + ".\n");

        int compareMoves = humanMove.compareMoves(computerMove);
        switch (compareMoves) {
            // Ничья
            case 0 -> System.out.println("Ничья!");
            // Победил игрок
            case 1 -> {
                System.out.println(humanMove + " beats " + computerMove + ". Вы победили!");
                userScore++;
            }
            // Победил компьютер
            case -1 -> {
                System.out.println(computerMove + " beats " + humanMove + ". Вы проиграли.");
                computerScore++;
            }
        }
        numberOfGames++;
        if (human.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }
    }

    private void printGameStats() {
        int wins = userScore;
        int losses = computerScore;
        int ties = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;

        // Вывод линии
        System.out.println("╔══════════╦═════════════╦══════════╦════════════════╦══════════════════╗");

        // Вывод заголовков таблицы
        System.out.printf("║  %6s  ║  %6s  ║  %6s  ║  %12s  ║  %14s  ║\n",
                "ПОБЕДА", "ПОРАЖЕНИЕ", "НИЧЬЯ", "ВСЕГО ИГР", "ПРОЦЕНТ ПОБЕД");

        // Вывод линии
        System.out.println("╠══════════╬═════════════╬══════════╬════════════════╬══════════════════╣");

        // Вывод значений
        System.out.printf("║  %6d  ║     %6d  ║  %6d  ║  %12d  ║  %13.2f%%  ║\n",
                wins, losses, ties, numberOfGames, percentageWon * 100);

        // Вывод линии
        System.out.println("╚══════════╩═════════════╩══════════╩════════════════╩══════════════════╝");

    }
}

