import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Calculate sum of digits
        int sum = calculateSumOfDigits(number);
        
        System.out.println("Sum of digits of " + number + " is: " + sum);
        
        scanner.close();
    }
    
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        
        // Iterate through each digit of the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to sum
            number /= 10; // Remove the last digit from number
        }
        
        return sum;
    }
}

