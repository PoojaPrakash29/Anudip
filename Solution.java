// Find the missing element in an array

package BasicsOfJava;
import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {
        // Example array with one missing element
        int[] array = {1, 2, 4, 5};
        int missingElement = element(array);
        System.out.println("The missing element is: " + missingElement);
    }
    public static int element(int[] array) {
        // Sort the array 
        Arrays.sort(array);

        // Check for the missing element
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 != array[i + 1]) {
                return array[i] + 1;
            }
        }

        // If no missing element is found, return -1 or another appropriate value
        return -1;
    }
}
