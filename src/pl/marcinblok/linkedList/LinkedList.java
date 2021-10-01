package pl.marcinblok.linkedList;

import java.util.NoSuchElementException;

public class LinkedList<I extends Number> {

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    // addLast
    public void addLast(int item) {
        // Wrapping this value, this int item inside node object
        Node node = new Node(item);
        // Calling my private method to make code more readable (see code below).
        if (isEmpty()) {
            head = tail = node;
        } else {
            // Here I'm linking last node to my new node
            tail.next = node;
            tail = node;
        }

    }

    // addFirst
    public void addFirst(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    private boolean isEmpty() {
        return head == null;
    }

    // deleteFirst
    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node second = head.next;
        head.next = null;
        head = second;
    }

    // deleteLast

    public void deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node previous = getPrevious(tail);
        tail = previous;
        tail.next = null;
    }

    private Node getPrevious(Node node) {
        Node current = head;
        while (current != null) {
            if (current.next == node) {
                return current;
            } else {
                current = current.next;
            }
        }
        return null;
    }

    // contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // indexOf
    public int indexOf(int item) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.value == item) {
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }


}
