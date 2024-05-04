# Linked list

Linked list is a linear collection of data elements whose order is not given by their physical placement in memory.
Instead, each element points to the next. It is a ds consisting of a collection of nodes which together represent sequence.
In its most basic form, each node contains data, and a reference (link) to the next node in the sequence.
This structure allows for efficient insertion or removal of elements from any position in the sequence during iteration.

The principal benefit of a linked list over a conventional array is that the list elements can be easily inserted or removed without reallocation or reorganization of the entire structure because the data items do not need to be stored contiguously in memory or on disk, while restructuring an array at run-time is a much more expensive operation. Linked lists allow insertion and removal of nodes at any point in the list, and allow doing so with a constant number of operations by keeping the link previous to the link being added or removed in memory during list traversal.

### Basic contepts

Each record of a linked list is called an "element" or "node".

The field of each node that contains the address of the next node is usually called the "next link" or "next pointer". The remaining fields are known as the "data", "information", "value", "cargo", or "payload" fields.

The "head" of a list is its first node. The "tail" of a list may refer either to the rest of the list after the head, or to the last node in the list.

#### Singly linked list

Singly linked list contain nodes which have a "value" field as well as "next" field, which points to the next node in line of nodes.

- insertion
- deletion
- traversal

![image](https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Singly-linked-list.svg/408px-Singly-linked-list.svg.png)

#### Doubly linked list

In a "doubly linked list", each node contains, besides the next-node link, a second link field pointing to the "prev" node in the sequence.
The two links may be called "forwards" and "backwards", or "next" and "prev".

![image](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Doubly-linked-list.svg/610px-Doubly-linked-list.svg.png)

Many modern operating systems use doubly linked lists to maintain references to active processes, threads, and other dynamic objects.
