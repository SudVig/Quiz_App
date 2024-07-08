
import java.util.*;

// Quiz.java
public class Quiz {
    List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java Quiz!");
        System.out.println("----------------------------");
        for (Question question : questions) {
            System.out.println(question.getText());
            System.out.println("Options: ");
            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println((i + 1) + ". " + question.getOptions()[i]);
            }
            String userAnswer = getUserInput(question.getOptions(), scanner);
            if (userAnswer.equals(question.getCorrectAnswer())) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + question.getCorrectAnswer());
            }
            System.out.println();
        }
        System.out.println("Your final score: " + score + "/" + questions.size());
        System.out.println("Thanks for playing!");
    }

    private String getUserInput(String[] options, Scanner scanner) {
        System.out.println("Enter your answer (1-" + options.length + "): ");
        int userAnswer = scanner.nextInt();
        if(userAnswer < 1 || userAnswer > options.length) {
            System.out.println("Invalid input. Please enter a number between 1 and " + options.length);
            return getUserInput(options, scanner);
        }
        return options[userAnswer - 1];
    }

    public int getScore() {
        return score;
    }
}
