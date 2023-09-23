/* From Discrete Mathematics (MATH1510) - Algorithms - Selection-sort:
(Sorting a list into increasing order)
 * 1. Assume we have 'n' items to sort
 * 2. Put them in an array A[0],...,A[n-1]
 * 3. For k = n-1, n-2, ..., 2, 1, (count down the index number of the array) do:
 * - Choose 'r' such that A[r] >= A[0],...,A[k] 
 *  i.e:
 *   - Set r = 0
 *   - For i = 1,...,k do if (A[i] > A[r]) then r = i
 * - Swap A[r] with A[k]
 *  Apply the algorithm to: {3, 1, 4, 5, 6, 2} 
 *                   index:  0  1  2  3  4  5 
 * n = 6
 * Note that: 'r' keeps track of the index of the largest item so far in A[0]...A[i]
 */
import java.util.Arrays;

class SelectionSort {
    
    static int[] numbers = {3, 1, 4, 5, 6, 2};
    
        public static void main(String args[]) {
            int n = numbers.length;
            // Initial listing:
            System.out.println("Initial array: " + Arrays.toString(numbers) + "\n");

            // Index countdown (for loop):
            for (int k = n - 1; k >= 0; k--) {
                int r = 0;
                System.out.println(Arrays.toString(numbers));
                // Finding the index 'r' of the largest item in the array
                for (int i = 1; i <= k; i++) {
                    if (numbers[i] > numbers[r]) {
                        r = i;
                    }
                }
                // Swap A[r] with A[k]
                int temp = numbers[r];
                numbers[r] = numbers[k];
                numbers[k] = temp;
            }
            System.out.println("\nFinal array: " + Arrays.toString(numbers));
        }
    }
