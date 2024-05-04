package com.blitzhetz.lists;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head = null;

    public void add(int data) {
        Node node = new Node(data);

        Node current = head;

        if (head == null)
            head = node; // if list is empty set set the head to the newly created node.
        else {
            while (current.next != null) { // iterate through the list until it reaches that last node (the one whose
                                           // "next" reference is null)
                current = current.next;
            }
            // this is simply reference of the last node to the new node
            current.next = node; // attach new node to the end
        }
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head; // set the next reference of the new node to point to the current "head" node

        head = node; // update the "head" reference to point to the newly added node
    }

    public void delete(int data) {
        Node current = head; // Start traversing the list from the head

        // traverse the list until the next node is null (end of the list) or until
        // the next nodes data matches the given data
        while (current.next != null && current.next.data != data) {
            current = current.next; // move to the next node
        }

        // if a node with the given data is found, update the next reference of the
        // current node to skip the node to be deleted
        if (current.next != null) {
            current.next = current.next.next; // skip the node to be deleted
        }
    }

    public void print() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(6);

        linkedList.addFirst(4);

        linkedList.print();

        linkedList.delete(1);

        linkedList.print();
    }
}
