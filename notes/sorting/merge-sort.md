# Merge sort

Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.

- Best Case: O(n log (n))

### Logic

- Divide and conquer, recursion, tree

- Divide and conquer -> break down the problem into subproblems and apply the algorithm on those particular subproblems

1. find the middle point to divide the array into two halves (median, middle point)
2. call mergeSort for left half.
3. call mergeSort for right half.
4. merge the two halves sorted in step 2 and 3.
