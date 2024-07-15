import java.util.Scanner;

public class MarriageEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input age
        System.out.print("Enter person's age: ");
        int age = scanner.nextInt();
        
        // Input salary
        System.out.print("Enter person's salary (in lakhs): ");
        double salary = scanner.nextDouble();
        
        // Check eligibility
        if (age < 30 && salary > 1.0) { // Checking age less than 30 and salary greater than 1 lakh
            System.out.println("Person is eligible for marriage.");
        } else {
            System.out.println("Person is not eligible for marriage.");
        }
        
        scanner.close();
    }
}

