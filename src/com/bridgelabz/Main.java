package com.bridgelabz;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addFirst(70);
        list.addFirst(56);
        list.addAtSpecificPosition(30, 2);
        list.deleteHeadNode();
        list.printList();
    }
}
