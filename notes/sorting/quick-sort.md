# Quick sort

- Best Case: O(n log (n))

Commercial computing, search for information, operations research, event-driven simulation, numerical computations, combinatorial search.

### Logic

- Divide and conquer, recursion, tree
- Pivot -> central point of a problem

- Choose a Pivot: Select a pivot element from the array. This can be done in various ways, such as choosing the first element, the last element, a random element, or the median of three elements.

- Partitioning: Rearrange the array so that all elements less than the pivot are on the left side of the pivot, and all elements greater than the pivot are on the right side. This step effectively places the pivot element in its correct sorted position in the array. This step is typically performed using two pointers that start at the ends of the array and move towards each other, swapping elements as needed.

- Recursively Sort Subarrays: Recursively apply the above steps to the subarrays on the left and right sides of the pivot. This step continues until the base case is reached, where the subarray has zero or one element.

- Base Case: The base case occurs when the subarray has zero or one element. In this case, the subarray is already considered sorted, and no further action is needed.

- Combine: As the recursion unwinds, the sorted subarrays are combined to form the final sorted array.
