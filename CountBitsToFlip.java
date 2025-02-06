/*CPrint an integer representing the minimum number of bits that must be flipped*/
import java.util.*;
class Main {
    // Function to count the number of bits to be flipped
    public static int countBitsToFlip(int a, int b) {
        // XOR a and b to get the positions where the bits differ
        int xor = a ^ b;
        
        // Count the number of 1s in the XOR result
        int count = 0;
        while (xor != 0) {
            count += xor & 1; // Increment count if the last bit is 1
            xor >>= 1; // Right shift the xor result to check the next bit
        }
        return count; // Return the number of bits to be flipped
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input two integers
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        // Output the number of bits that need to be flipped
        System.out.println(countBitsToFlip(a, b));
    }
}
