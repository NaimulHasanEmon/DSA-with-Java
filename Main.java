import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Adding data in the list.
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(9);

        // Printing list elements.
        System.out.println("List elements = " + list);

        // Printing list size.
        System.out.println("Size of list = " + list.size());
        list.removeFirst();
        System.out.println("List elements = " + list);

        // Printing list elements.
        System.out.print("List elements = ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        // Removing data from the list.
        list.removeLast();
        System.out.println("List elements = " + list);
        System.out.println("Size of list = " + list.size());

        // Removing all data from the list.
        list.removeAll(list);
        System.out.println("List elements = " + list);
        System.out.println("Size of list = " + list.size());
    }
}