package HM15;

import java.io.*;

public class OneTwoThree {
    private final Human human;
    private final Computer computer;
    private int humanScore;
    private int computerScore;
    private int numberOfGames;
    public OneTwoThree() {
        human = new Human();
        computer = new Computer();
        humanScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }
    public void startGame() {
        System.out.println("ONE, TWO, THREE!");
        String result = "";
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
                humanScore++;
            }
            // Победил компьютер
            case -1 -> {
                System.out.println(computerMove + " beats " + humanMove + ". Вы проиграли.");
                computerScore++;
            }
        }
        if(computerScore> humanScore){
            result = "COMPUTER";
        } else if (humanScore >computerScore){
            result = "HUMAN";
        } else {
            result = "FRIENDSHIP";
        }

        numberOfGames++;
        if (human.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }
        writeToFile(result, humanScore,computerScore);
    }


    public static void writeToFile(String result,int humanCount,int compCount){
        BufferedWriter writer = null;
        try{

            writer = new BufferedWriter(new FileWriter("C://Score.txt",true));
            writer.append("Game: ").append(result).append(" WON(Human - ").append(String.valueOf(humanCount)).append(", Comp - ").append(String.valueOf(compCount)).append(");");
            writer.newLine();



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void readFromFile(){
        String inputFileName = "C://ResultOfTheGames.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clearFile(){
        BufferedWriter writer = null;
        try{
            String startString = "";
            writer = new BufferedWriter(new FileWriter("C://ResultOfTheGames.txt"));
            writer.write(startString);



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void printGameStats() {
        int wins = humanScore;
        int losses = computerScore;
        int ties = numberOfGames - humanScore - computerScore;
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

