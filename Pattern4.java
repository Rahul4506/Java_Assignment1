public class Pattern4 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pattern
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop for spaces before stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Print spaces
            }
            
            // Inner loop for printing stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // Print stars without space after last star
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
