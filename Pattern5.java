public class Pattern5 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop for printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Print spaces
            }
            
            // Inner loop for printing stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // Print stars with space after each star
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
