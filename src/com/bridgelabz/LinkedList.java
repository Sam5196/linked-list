package com.bridgelabz;


public class LinkedList {
    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    void addAtSpecificPosition(int data, int position) {
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = null;

        if(position < 1) {
            System.out.print("\nposition should be >= 1.");
        } else if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {

            Node temp = new Node(data);
            temp = head;
            for(int i = 1; i < position-1; i++) {
                if(temp != null) {
                    temp = temp.next;
                }
            }

            if(temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.print("\nThe previous node is null.");
            }
        }
    }

    public Node deleteHeadNode() {
        System.out.println("Deleted node from start : " + head.data);
        head = head.next;
        return head;
    }

    public void deleteLastNode() {

        if (head == null || head.next == null) {
            return;
        }

        Node currentHead = head;
        while (currentHead.next.next != null) {
            currentHead = currentHead.next;
        }

        currentHead.next = null;

    }
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
        System.out.println("");
    }
}
