import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to add: ");
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i, sc.nextInt());
        }
        System.out.println("List: " + list);
        LinkedList<Integer> list2 = new LinkedList<>();
        int j = list.size() - 1;
        for (int i = 0; i < n; i++) {
            list2.add(i, list.get(j));
            j--;
        }
        System.out.println("Reversed List: " + list2);

        // Time complexity O(n);
    }
}
