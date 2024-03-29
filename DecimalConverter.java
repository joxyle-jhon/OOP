import java.util.Scanner;

public class DecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive decimal value: ");
        int decimalValue = scanner.nextInt();

        System.out.println("Value to which number system:");
        System.out.println("1 - Decimal to Binary");
        System.out.println("2 - Decimal to Octal");
        System.out.println("3 - Decimal to Hexadecimal");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                convertToBinary(decimalValue);
                break;
            case 2:
                convertToOctal(decimalValue);
                break;
            case 3:
                convertToHexadecimal(decimalValue);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }

    public static void convertToBinary(int decimalValue) {
        int[] binaryArray = new int[32];
        int index = 0;
        while (decimalValue > 0) {
            binaryArray[index++] = decimalValue % 2;
            decimalValue /= 2;
        }
        System.out.print("Equivalent of " + decimalValue + " in binary is ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binaryArray[i]);
        }
    }

    public static void convertToOctal(int decimalValue) {
        int[] octalArray = new int[32];
        int index = 0;
        while (decimalValue > 0) {
            octalArray[index++] = decimalValue % 8;
            decimalValue /= 8;
        }
        System.out.print("Equivalent of " + decimalValue + " in octal is ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(octalArray[i]);
        }
    }

    public static void convertToHexadecimal(int decimalValue) {
        char[] hexArray = new char[32];
        int index = 0;
        while (decimalValue > 0) {
            int remainder = decimalValue % 16;
            if (remainder < 10) {
                hexArray[index++] = (char) (remainder + '0');
            } else {
                hexArray[index++] = (char) (remainder - 10 + 'A');
            }
            decimalValue /= 16;
        }
        System.out.print("Equivalent of " + decimalValue + " in hexadecimal is ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(hexArray[i]);
        }
    }
}
