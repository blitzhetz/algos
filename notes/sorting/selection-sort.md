# Selection sort

Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list.

The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps it with the first element of the unsorted part. This process is repeated for the remaining unsorted portion until the entire list is sorted.

1. Time complexity -> O(n ^ 2), two nested loops
2. Space complexity -> O(1)

Used when memory write is a costly operation

### Logic

arr[64, 25, 12, 22, 11]

first iteration

For the first position in the sorted array, the whole array is traversed from index 0 to 4 sequentially. The first position where 64 is stored presently, after traversing whole array it is clear that 11 is the lowest value.
Thus, replace 64 with 11. After one iteration 11, which happens to be the least value in the array, tends to appear in the first position of the sorted list.

second iteration

For the second position, where 25 is present, again traverse the rest of the array in a sequential manner.
After traversing, we found that 12 is the second lowest value in the array and it should appear at the second place in the array, thus swap these values.

third iteration

Now, for third place, where 25 is present again traverse the rest of the array and find the third least value present in the array.
While traversing, 22 came out to be the third least value and it should appear at the third place in the array, thus swap 22 with element present at third position.

fourth iteration

Similarly, for fourth position traverse the rest of the array and find the fourth least element in the array
As 25 is the 4th lowest value hence, it will place at the fourth position.

fifth iteration:

At last the largest value present in the array automatically get placed at the last position in the array
The resulted array is the sorted array.
