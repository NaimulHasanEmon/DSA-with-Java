import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int n = 4, m = 1;
        for (int i = 0; i < n; i++) {
            list.add(i, m);
            m++;
        }
        System.out.println("List: " + list);
        LinkedList<Integer> list2 = new LinkedList<>();
        int j = list.size() - 1;
        for (int i = 0; i < n; i++) {
            list2.add(i, list.get(j));
            j--;
        }
        System.out.println("Reversed List: " + list2);

        // Time complexity O(n) and extra spaces;
    }
}
