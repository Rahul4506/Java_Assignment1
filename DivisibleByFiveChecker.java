<<<<<<< HEAD
import java.util.Scanner;

public class DivisibleByFiveChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }
        
        scanner.close();
    }
}

=======
import java.util.Scanner;

public class DivisibleByFiveChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }
        
        scanner.close();
    }
}

>>>>>>> fa3c752de33d9195fdc13ea4d26f434a244917bb
