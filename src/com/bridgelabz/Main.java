package com.bridgelabz;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addFirst(70);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(56);
        list.deleteNode(40);
        list.printList();
        list.size();

    }
}
