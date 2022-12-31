import java.util.ArrayList;
import java.util.Arrays;

public class Stacks {
    public static ArrayList<Integer> arr = new ArrayList<>();

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
        buildStack(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        buildStack(arr);

    }

    public static void buildStack(ArrayList<Integer> arr) {
        int i = 0;
        int j = arr.size() - 1;
        int end = arr.get(i);
        int begin = arr.get(j);
        while (i < j) {
            end = arr.get(j);
            begin = arr.get(i);
            arr.set(i, end);
            arr.set(j, begin);
            i++;
            j--;
        }
        System.out.println(arr);
    }

    public static void push(int item) {
        arr.add(item);
    }

    // public void printStack() {
    // reverse(customStack);
    // System.out.println(cStack);
    // }

    // public int peek() {
    // return cStack.get(0);
    // }

    // public int pop() {
    // return cStack.remove(0);
    // }

}
