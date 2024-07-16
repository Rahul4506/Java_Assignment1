import java.util.Scanner;

public class ShoeBrandSlogan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a shoe brand name: ");
        String brandName = scanner.nextLine();
        
        String slogan = getSlogan(brandName);
        
        if (slogan != null) {
            System.out.println("Brand: " + brandName);
            System.out.println("Slogan: " + slogan);
        } else {
            System.out.println("Sorry, no slogan found for " + brandName);
        }
        
        scanner.close();
    }
    
    public static String getSlogan(String brandName) {
        switch (brandName.toLowerCase()) {
            case "nike":
                return "Just do it";
            case "adidas":
                return "Impossible is nothing";
            case "puma":
                return "Forever Faster";
            case "reebok":
                return "I Am What I Am";
            default:
                return null;
        }
    }
}

