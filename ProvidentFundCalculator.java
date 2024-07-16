<<<<<<< HEAD
import java.util.Scanner;

public class ProvidentFundCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();
        
        double providentFund = calculateProvidentFund(basicSalary);
        
        System.out.println("Basic Salary: Rs " + basicSalary);
        System.out.println("Provident Fund (12% of Basic Salary): Rs " + providentFund);
        
        scanner.close();
    }
    
    public static double calculateProvidentFund(double basicSalary) {
        return 0.12 * basicSalary; // Provident Fund is 12% of Basic Salary
    }
}

=======
import java.util.Scanner;

public class ProvidentFundCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();
        
        double providentFund = calculateProvidentFund(basicSalary);
        
        System.out.println("Basic Salary: Rs " + basicSalary);
        System.out.println("Provident Fund (12% of Basic Salary): Rs " + providentFund);
        
        scanner.close();
    }
    
    public static double calculateProvidentFund(double basicSalary) {
        return 0.12 * basicSalary; // Provident Fund is 12% of Basic Salary
    }
}

>>>>>>> fa3c752de33d9195fdc13ea4d26f434a244917bb
