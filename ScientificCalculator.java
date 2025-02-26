
import java.util.Scanner;

class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Scientific Calculator ---");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to find the square root: ");
                    double num1 = scanner.nextDouble();
                    if (num1 < 0) {
                        System.out.println("Error: Cannot take square root of a negative number.");
                    } else {
                        System.out.println("Square root of " + num1 + " is: " + Math.sqrt(num1));
                    }
                    break;
                case 2:
                    System.out.print("Enter a number to calculate factorial: ");
                    int num2 = scanner.nextInt();
                    if (num2 < 0) {
                        System.out.println("Error: Factorial is not defined for negative numbers.");
                    } else {
                        System.out.println("Factorial of " + num2 + " is: " + factorial(num2));
                    }
                    break;
                case 3:
                    System.out.print("Enter a number to calculate natural logarithm: ");
                    double num3 = scanner.nextDouble();
                    if (num3 <= 0) {
                        System.out.println("Error: Logarithm is undefined for zero or negative values.");
                    } else {
                        System.out.println("Natural logarithm of " + num3 + " is: " + Math.log(num3));
                    }
                    break;
                case 4:
                    System.out.print("Enter the base number (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent (b): ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + " raised to the power of " + exponent + " is: " + Math.pow(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting the calculator. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
                    break;
            }
        }
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}

