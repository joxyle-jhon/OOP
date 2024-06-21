import java.util.Scanner;

public class omblero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfQuizzes = 5;
        double[] quizScores = new double[numOfQuizzes];

        System.out.println("Enter the scores of " + numOfQuizzes + " quizzes:");

        for (int i = 0; i < numOfQuizzes; i++) {
            System.out.print("Quiz " + (i + 1) + " score: ");
            quizScores[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double score : quizScores) {
            sum += score;
        }
        double average = sum / numOfQuizzes;

        System.out.println("The average score of the quizzes is: " + average);

        scanner.close();
    }
}


