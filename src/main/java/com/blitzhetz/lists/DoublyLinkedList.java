package com.blitzhetz.lists;

class Node {
    int data;
    Node previous;
    Node next;

    public Node(int data) {
        this.data = data;
    }

}

class LinkedList {
    Node head, tail = null;

    public void add(int data) {
        Node node = new Node(data);

        // if list is empty, set head and tail to point to new node
        if (head == null) {
            head = tail = node;
            head.previous = null; // head previous will be null
            tail.next = null; // tail next will be null
        } else {
            // if there is already node add new node to the end of list
            tail.next = node;
            // new node previous set tot ail
            node.previous = tail;
            // new node becomes new tail
            tail = node;
            // tail next point to null
            tail.next = null;
        }
    }

    public void addFirst(int data) {
        Node node = new Node(data);

        // if list is empty, set both head and tail to point to the new node
        if (head == null) {
            head = tail = node;
            head.previous = null; // set heads previous reference to null
            tail.next = null; // set tails next reference to null
        } else {
            // if there are already nodes in the list
            // update references to include the new node at the beginning

            node.next = head; // set the next reference of the new node to the current head
            head.previous = node; // set the previous reference of the current head to the new node
            head = node; // update head to point to the new node

            // since we've added a new node at the beginning,
            // its previous reference should be null
            head.previous = null;
        }
    }

    public void delete(int data) {
        Node current = head;

        while (current != null && current.data != data) {
            current = current.next; // Move to the next node
        }

        // if a node with the given data is found
        if (current != null) {
            // if the node to be deleted is the head node
            if (current == head) {
                head = head.next; // update the head to skip the node to be deleted
                if (head != null) {
                    head.previous = null; // update the new heads previous reference to null
                } else {
                    tail = null; // if head becomes null, set tail to null as well
                }
            } else {
                // if the node to be deleted is not the head node
                // update the next reference of the previous node to skip the node to be deleted
                current.previous.next = current.next;
                // if the node to be deleted is not the tail node
                if (current.next != null) {
                    // update the previous reference of the next node to skip the node to be deleted
                    current.next.previous = current.previous;
                } else {
                    // if the node to be deleted is the tail node
                    tail = current.previous; // update the tail to the previous node
                }
            }
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

public class DoublyLinkedList {
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
