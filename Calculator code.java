import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;

        while (true) {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Enter operator (+, -, *, /) or 'q' to quit:");
            operator = scanner.next().charAt(0);

            if (operator == 'q') {
                System.out.println("Exiting calculator.");
                break;
            }

            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Cannot divide by zero");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator");
            }
        }

        scanner.close();
    }
}
