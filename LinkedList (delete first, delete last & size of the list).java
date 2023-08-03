public class Main {
    Node head;
    private int size;

    Main() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
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
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.\n");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlastNode = head;
        Node lastNode = head.next;
        if (lastNode.next != null) {
            secondlastNode = lastNode;
            lastNode = lastNode.next;
        }
        secondlastNode.next = null;
    }

    public int getSize() {
        return size;
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
        System.out.println("Now list size is = " + list.getSize());
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println("Now list size is = " + list.getSize());
        list.addFirst(10);
        list.printList();
        System.out.println("Now list size is = " + list.getSize());
    }
}
