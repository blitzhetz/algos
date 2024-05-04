# Insertion sort

Insertion sort is an in place sorting algorithm meaning it won't take any extra space to sort the array items. It works similar to the way you sort playing cards in your hand. Consider you are dealt 4 cards one after the other. You pick one and keep in your hand, after that for the next card (key) you compare with the one in your hand and place it accordingly and so on until all the cards are in your hand.

1. Time complexity -> O(n ^ 2)
2. Space complexity -> O(1)

### Logic

To sort an array of size n in ascending order:

- Iterate from second element, arr[1] to arr[n-1] over the array.
- Compare the current element (key) to its predecessor.
- If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.

![image](https://media.geeksforgeeks.org/wp-content/uploads/20240408140301/Insertion-Sort.webp)

First iteration:
Current element is 23
The first element in the array is assumed to be sorted.
The sorted part until 0th index is : [23]

Second iteration:
Compare 1 with 23 (current element with the sorted part).
Since 1 is smaller, insert 1 before 23.
The sorted part until 1st index is: [1, 23]

Third iteration:
Compare 10 with 1 and 23 (current element with the sorted part).
Since 10 is greater than 1 and smaller than 23, insert 10 between 1 and 23.
The sorted part until 2nd index is: [1, 10, 23]

Fourth iteration:
Compare 5 with 1, 10, and 23 (current element with the sorted part).
Since 5 is greater than 1 and smaller than 10, insert 5 between 1 and 10.
The sorted part until 3rd index is: [1, 5, 10, 23]

Fifth iteration:
Compare 2 with 1, 5, 10, and 23 (current element with the sorted part).
Since 2 is smaller than all elements in the sorted part, insert 2 at the beginning.
The sorted part until 4th index is: [2, 1, 5, 10, 23]
