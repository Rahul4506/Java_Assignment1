public class Pattern3 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pattern
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
