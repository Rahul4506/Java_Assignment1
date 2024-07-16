import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        
        long factorial = calculateFactorial(number);
        
        if (factorial != -1) {
            System.out.println("Factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Cannot calculate factorial for negative numbers.");
        }
        
        scanner.close();
    }
    
    public static long calculateFactorial(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }
        long factorial = 1;
        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }
        return factorial;
    }
}

