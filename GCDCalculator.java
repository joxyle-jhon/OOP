import java.util.Scanner;

public class GCDCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);

        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);

        scanner.close();
    }
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
