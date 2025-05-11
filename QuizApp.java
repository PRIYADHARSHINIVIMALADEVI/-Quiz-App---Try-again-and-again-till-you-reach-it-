import java.awt.Toolkit;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean Retry;
        String[] Questions = {
            "Who is the CEO of Cognizant?",
            "Who is the CEO of Infosys?",
            "Who is the CEO of HP?",
            "Who is the CEO of LTI Mindtree?",
            "Who is the Chairman of TCS?"
        };

        String[][] Options = {
            {"A) Mr. R. Kumar S", "B) Mr. S. Parekh", "C) Mr. D. Chatterjee", "D) Mr. E. Lores"},
            {"A) Mr. R. Kumar S", "B) Mr. S. Parekh", "C) Mr. D. Chatterjee", "D) Mr. E. Lores"},
            {"A) Mr. R. Kumar S", "B) Mr. S. Parekh", "C) Mr. D. Chatterjee", "D) Mr. E. Lores"},
            {"A) Mr. R. Kumar S", "B) Mr. S. Parekh", "C) Mr. D. Chatterjee", "D) Mr. E. Lores"},
            {"A) Mr. N. Chandrasekaran", "B) Mr. S. Parekh", "C) Mr. D. Chatterjee", "D) Mr. E. Lores"}
        };

        char[] Answers = {'A', 'B', 'D', 'C', 'A'};
        do {
            int Score = 0;

            System.out.println("Welcome to Our Online Quiz App!");
            System.out.println("--------------------------------\n");

            for (int i = 0; i < Questions.length; i++) {
                System.out.println((i + 1) + ". " + Questions[i]);
                for (String Option : Options[i]) {
                    System.out.println(Option);
                }
                System.out.print("Enter your answer (A/B/C/D): ");
                char userAnswer = Character.toUpperCase(sc.next().charAt(0));

                if (userAnswer == Answers[i]) {
                    System.out.println("Correct!\n");
                    Toolkit.getDefaultToolkit().beep(); 
                    Score++;
                } else {
                    System.out.println("Wrong! The correct answer was " + Answers[i] + ".\n");
                }
            }

            System.out.println("--------------------------------");
            System.out.println("Quiz Completed!");
            System.out.println("The final score: " + Score + "/" + Questions.length);
            System.out.print("Let's try again? (yes/no): ");

            String RetryInput = sc.next().trim().toLowerCase();
            Retry = RetryInput.equals("yes");

        } while (Retry);

        System.out.println("Thanks for playing!");
    }
}
