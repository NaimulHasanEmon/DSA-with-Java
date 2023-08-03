public class Main {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

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
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.\n");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.\n");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node LastNode = head.next;
        if (LastNode.next != null) {
            secondLastNode = secondLastNode.next;
            LastNode = LastNode.next;
        }
        secondLastNode.next = null;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.\n");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.addFirst(2);
        list.printList();
        list.addFirst(1);
        list.printList();
        list.addLast(3);
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
    }
}