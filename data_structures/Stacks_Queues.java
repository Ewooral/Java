import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Queue;

public class Stacks_Queues {
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static ArrayDeque<Integer> queue = new ArrayDeque<>();
    public static Queue<Integer> QUEUE = new LinkedList<>();

    // public void reverse(ArrayList<Integer> arr) {
    // for (int i = arr.size() - 1; i != -1; i--) {
    // int value = arr.get(i);
    // cStack.add(value);
    // }
    // }
    // [12, 2, -9, 0, 4, 1]
    public static void main(String[] args) {
        push(12);
        push(2);
        push(-9);
        push(0);
        push(4);
        push(1);
        push(203);

        // TRAVERSE
        System.out.println("........TRAVERSE........");
        traverse();

        // STACK
        System.out.println("\n........STACK........");
        buildStack(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        buildStack(arr);
        System.out.println(peek());
        System.out.println(pop());
        buildStack(arr);

        // QUEUE
        System.out.println("........QUEUE........");
        queue.add(12);
        queue.add(2);
        queue.add(-9);
        queue.add(0);
        queue.add(4);
        System.out.println(queue);
    }

    // build stack
    public static void buildStack(ArrayList<Integer> arr) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            int begin = arr.get(i);
            int end = arr.get(j);
            arr.set(i, end);
            arr.set(j, begin);
            i++;
            j--;
        }
        System.out.println(arr);
    }

    // push
    public static void push(int item) {
        arr.add(item);
    }

    // peek
    public static int peek() {
        return arr.get(0);
    }

    // pop
    public static int pop() {
        return arr.remove(0);
    }

    // Traverse arr
    public static void traverse() {
        Iterator<Integer> I = arr.iterator();
        while (I.hasNext()) {
            System.out.print(I.next() + ", ");
        }
    }

}
