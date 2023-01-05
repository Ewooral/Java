import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Queue;

public class Stacks_Queues {
    public ArrayList<Integer> arr = new ArrayList<>();
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
        Stacks_Queues stacks = new Stacks_Queues();
        // stacks.push(12);
        // stacks.push(2);
        // stacks.push(-9);
        // stacks.push(0);
        // stacks.push(4);
        // stacks.push(1);
        // stacks.push(203);

        // TRAVERSE
        System.out.println("........TRAVERSE........");
        stacks.traverse();

        // STACK
        System.out.println("\n........STACK........");

        stacks.addFirst(9);
        stacks.addFirst(23);
        stacks.addFirst(2);
        System.out.println(stacks.arr);

        // QUEUE
        System.out.println("........QUEUE........");
        queue.add(12);
        queue.add(2);
        queue.add(-9);
        queue.add(0);
        queue.add(4);
        System.out.println(queue);

        ;
        // System.out.println(queue);/
    }

    // build stack
    public void addFirst(int num) {
        arr.add(num);
        int i = 0;
        int j = arr.size() - 1;
        while (i < j && arr.size() > 1) {
            int begin = arr.get(i);
            int end = arr.get(j);
            arr.set(i, end);
            arr.set(j, begin);
            i++;
            j--;
        }

    }

    // push
    public void push(int item) {
        arr.add(item);
    }

    // peek
    public int peek() {
        return arr.get(0);
    }

    // pop
    public int pop() {
        return arr.remove(0);
    }

    // Traverse arr
    public void traverse() {
        Iterator<Integer> I = arr.iterator();
        while (I.hasNext()) {
            System.out.print(I.next() + ", ");
        }
    }

    public int countStr() {

        return 0;
    }

}
