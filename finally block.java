import java.util.Scanner;

public class finally block {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Execution of the division operation has completed.");
        }

        scanner.close();
    }

    public static int divide(int num, int denom) {
        return num / denom; // This may throw ArithmeticException
    }
}
