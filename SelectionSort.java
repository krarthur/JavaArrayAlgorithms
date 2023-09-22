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
 *                 index:  0  1  2  3  4  5 
 * n = 6
 * Note that: r keeps track of the index of the largest item so far in A[0]...A[i]
 */