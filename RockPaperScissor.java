import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    private static int compCounter = 0;
    private static int userCounter = 0;

    public static void main(String[] args) {
        RockPaperScissor game = new RockPaperScissor();
        int count = 5;
        while (count > 0) {
            game.playGame();
            count--;
        }
        game.displayResults();
        System.out.println("Thanks for playing!");
    }

    private static String startGame() {
        Random random = new Random();
        int compInput = random.nextInt(3);

        String[] choices = {"rock", "paper", "scissor"};

        return choices[compInput];
    }

    private static String getUserChoice() {
        System.out.println("Rock, Paper, Scissor! ");
        Scanner input = new Scanner(System.in);
        return input.next().toLowerCase();
    }

    private static void compare(String computerInput, String userInput) {
        if (computerInput.equals(userInput)) {
            System.out.println("Tie...");
        } else if (
            (computerInput.equals("rock") && userInput.equals("scissor")) ||
            (computerInput.equals("scissor") && userInput.equals("paper")) ||
            (computerInput.equals("paper") && userInput.equals("rock"))
        ) {
            compCounter++;
            System.out.println("You lost!");
        } else {
            userCounter++;
            System.out.println("You Won!");
        }
    }

    public void playGame() {
        String computerInput = startGame();
        String userChoice = getUserChoice();
        compare(computerInput, userChoice);
    }

    private void displayResults() {
        System.out.println("Game Over! Results:");
        System.out.println("Computer Wins: " + compCounter);
        System.out.println("User Wins: " + userCounter);
    }
}
