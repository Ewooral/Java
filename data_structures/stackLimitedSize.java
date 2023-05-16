package data_structures;

import java.util.ArrayList;

public class stackLimitedSize {
    int maxSize = 10;
    private int[] arr = new int[maxSize];
    private int i = 0;
    private int j = 0;

    public void push(int v) {
        try {
            arr[i] = v;
            i++;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    public void pop() {
        int elem = arr[j];
        arr[j] = 0;
        j++;
        System.out.println(elem);
    }

    public void repeatedElem(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int curElem = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int nextElem = arr[j];
                if (curElem == nextElem) {
                    arr1.add(curElem);
                }
            }

        }
        System.out.println(arr1);
    }

    public static void main(String[] args) {
        stackLimitedSize stack = new stackLimitedSize();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // stack.pop();
        // stack.pop();
        // stack.pop();
        stack.push(9);
        stack.push(5);
        stack.push(5);
        stack.push(4);
        stack.push(2);
        stack.push(7);
        stack.push(2);
        System.out.println("..............");
        stack.push(-99);
        // stack.pop();
        // stack.pop();
        // stack.pop();
        System.out.println("...............");
        for (int num : stack.arr) {
            System.out.println(num);
        }
        System.out.println("..............");
        stack.repeatedElem(stack.arr);
    }
}
