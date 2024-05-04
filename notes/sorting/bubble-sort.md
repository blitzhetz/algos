# Bubble Sort

Bubble Sort also known as Sinking Sort is the simplest sorting algorithm. It swaps the numbers if they are not in correct order.

1. Time complexity -> O(n^2)
2. Space complexity -> O(1)

### Steps

- Compares the first element with the next element
- If the first el is larget than the next el then swap elements.
- Repeat same until the selected number is put to its correct position then the next element is compared.

### Logic

unsorted arr[6 2 4 3 8]
sorted arr[2 3 4 6 8]

first iteration

(6 2 4 3 8) -> (2 6 4 3 8) -> compares first two el, and swap them since 6 > 2
(2 6 4 3 8) -> (2 4 6 3 8) -> 6 > 4, swap
(2 4 6 3 8) -> (2 4 3 6 8) -> 6 > 3, swap
(2 4 3 6 8) -> (2 4 3 6 8) -> not swap, 8 > 6

second iteration

(2 4 3 6 8) -> (2 4 3 6 8)
(2 4 3 6 8) -> (2 3 4 6 8) -> swap, 4 > 3
(2 3 4 6 8) -> (2 3 4 6 8)
(2 3 4 6 8) -> (2 3 4 6 8)

Now, the array is already sorted, but the algorithm does not know if it is completed.

third iteration

(2 3 4 6 8) -> (2 3 4 6 8)
(2 3 4 6 8) -> (2 3 4 6 8)
(2 3 4 6 8) -> (2 3 4 6 8)
(2 3 4 6 8) -> (2 3 4 6 8)

...

### Pseudo

```
procedure BubbleSort(unsorted arr)
    size = arr length
    temp = 0

    for (i = 0; i < size; i++)
        for (j = 0; j < size - i - 1; j++)
            if (arr[j] > arr[j + 1])
                swap
end procedure
```
