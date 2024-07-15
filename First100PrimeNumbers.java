public class First100PrimeNumbers {
    public static void main(String[] args) {
        int count = 0; // Count of prime numbers found
        int number = 2; // Start checking from 2
        
        System.out.println("First 100 prime numbers:");
        
        // Loop until we find 100 prime numbers
        while (count < 100) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, not prime
            }
        }
        return true; // Otherwise, it's a prime number
    }
}

