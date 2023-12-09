import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        while (true) {
            System.out.println("Choose your move: (Rock, Paper, Scissors, or Quit)");
            String playerChoice = scanner.nextLine();

            if (playerChoice.equalsIgnoreCase("Quit")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            int randomIndex = random.nextInt(choices.length);
            String computerChoice = choices[randomIndex];

            System.out.println("Computer's choice: " + computerChoice);

            if (playerChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                       (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                       (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}
