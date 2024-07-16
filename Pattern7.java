<<<<<<< HEAD
public class Pattern7 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for Pascal's Triangle
        
        // Create Pascal's Triangle
        int[][] triangle = new int[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // Set first element of each row to 1
            
            // Calculate middle elements of the row
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
            
            // Set last element of each row to 1
            triangle[i][i] = 1;
        }
        
        // Print Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            // Print spaces for formatting
            for (int k = 0; k < rows - i; k++) {
                System.out.print(" ");
            }
            
            // Print elements of the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            
            System.out.println(); // Move to the next line after each row
        }
    }
}
=======
public class Pattern7 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for Pascal's Triangle
        
        // Create Pascal's Triangle
        int[][] triangle = new int[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // Set first element of each row to 1
            
            // Calculate middle elements of the row
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
            
            // Set last element of each row to 1
            triangle[i][i] = 1;
        }
        
        // Print Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            // Print spaces for formatting
            for (int k = 0; k < rows - i; k++) {
                System.out.print(" ");
            }
            
            // Print elements of the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            
            System.out.println(); // Move to the next line after each row
        }
    }
}
>>>>>>> fa3c752de33d9195fdc13ea4d26f434a244917bb
