/* From Discrete Mathematics (MATH1510) - Algorithms - Shuffle:
 * 1. Assume we have 'n' items to permute
 * 2. Put them in an array A[0],...,A[n-1]
 * 3. For k = n-1, n-2, ..., 2, 1, (count down the index number of the array) do:
 * - Select random 'r' element in {0,1,...,k} (Another algorithm would need to be involved to select a random element)
 * - Swap A[r] with A[k]
 *  Apply the algorithm to: {bandicoot, bilby, echidna, kangaroo, koala, platypus, possum, wallaby}
 *                               0        1       2         3       4       5         6       7
 * n = 8
 */
class Shuffle {
    static String[] animals = {"bandicoot", "bilby", "echidna", "kangaroo", "koala", "platypus", "possum", "wallaby"};

        public static void main(String args[]) {
            // Initial listing:
            System.out.print(arrayList());
            System.out.println(" ("+animals.length+" in total)");

            // Index countdown (for loop):
            for (int k = animals.length - 1; k > 0; k--) {
                // Random index selection algorithm:
                int r = (int) (Math.random() * animals.length);
                System.out.print("\nIndex number " + r + " was chosen which corresponds to: ");
                System.out.println(animals[r]);

                // Swap A[r] with A[k]
                String aux = animals[r];
                animals[r] = animals[k];
                animals[k] = aux;

                System.out.println("Shuffled List: " + arrayList());
            }

            System.out.println("\nFinal shuffled List: " + arrayList());

        }

        private static String arrayList() { 
            StringBuilder result = new StringBuilder("Elements in the animals array: ");
            for (int i = 0; i < animals.length; i++) {
                result.append(animals[i]);
                if(i != animals.length - 1) {  // if it's not the last element, append a comma and space
                    result.append(", ");
                }
            }
            return result.toString();
        }
}