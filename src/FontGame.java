
import java.util.ArrayList;
import java.util.Scanner;

public class FontGame {
    private static ArrayList<String> inputs = new ArrayList<String>();
    private static int score = 0;

    static void playGame(ArrayList<String> fonts) {
        System.out.println("Welcome to the Font Guessing Game!");
        System.out.println("Type the name of a font, and I'll tell you if it's correct.");
        System.out.println("Type 'quit' to exit the game.\n");

        Scanner scanner = new Scanner(System.in);
        int tempScore = 0;
        int totalGuesses = 0;
        String guess = "";

        while (guess != "quit") {
            System.out.print("Guess #" + (totalGuesses + 1) + ": ");
            guess = scanner.nextLine();
            guess = guess.toLowerCase();

            inputs.add(guess);

            totalGuesses++;
            for (int i = 0; i < fonts.size(); i++) {
                if (fonts.get(i).toLowerCase().equals(guess)) {
                    score++;

                }
            }

            if (score == tempScore + 1) {
                if (checkDuplicates(guess) == false) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("You already guessed that!");
                }
                tempScore = score;
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("\nGame over. Your final score is: " + score + " out of " + totalGuesses);
        scanner.close();
    }

    static boolean checkDuplicates(String target) {
        boolean status = false;
        if (score != 1) {
            for (int i = 0; i < inputs.size(); i++) {
                if (inputs.get(i).toLowerCase().equals(target.toLowerCase())) {
                    status = true;
                }
            }
        }

        return status;
    }
}
