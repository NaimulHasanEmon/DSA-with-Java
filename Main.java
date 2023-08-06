import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter how many elements you want to add: ");
        int n = sc.nextInt();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            list.add(i, sc.nextInt());
        }
        System.out.println("Before removing: " + list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 25) {
                list.remove(i);
            }
        }
        System.out.println("After removing: " + list);
        sc.close();
    }
}