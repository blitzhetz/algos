# Binary Search

Binary search, also known as half-interval search, logarithmic search, or binary chop, is a search algorithm that finds the position of a target value within a sorted array. Binary search compares the target value to the middle element of array.

1. Time complexity -> O(log n)
2. Space complexity -> O(1)

Used when data is stored and large.

### Steps

- First we need to find a middle value of array.
- Before proceeding with comparisons, check if the middle element is equial to the target value, if it is, return the index
- If the middle el is less than the target value, adjust the start index accordingly and continue searching in the right half
- If the middle el is greater than the target value, adjust the end index accordingly and continue searching in the left half
- Repeat the steps until the start index is less than or equal to the end index
- If the el is not found return -1

### Pseudo

```
procedure BinarySearch(arr -> list of sorted items, target -> item to search for)
    start = 0
    end = length(arr) - 1

    while start <= end
        mid = (start + end) / 2

        if arr[mid] equals target then
            return mid // el is found return index where the target el is found
        else if arr[mid] < target then
            start = mid + 1 // cont searching in the right half
        else
            right = mid - 1 // cont searching in the left half
        end if

    end while

    return -1 // not found
end procedure
```
