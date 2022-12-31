import java.util.ArrayList;

public class Stacks {
    public static ArrayList<Integer> customStack = new ArrayList<>();
    public ArrayList<Integer> cStack = new ArrayList<>();

    public void buildStack(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i != -1; i--) {
            int value = arr.get(i);
            cStack.add(value);
        }
    }

    public void push(int item) {
        customStack.add(item);
    }

    public void printStack() {
        buildStack(customStack);
        System.out.println(cStack);
    }

    public int peek() {
        return cStack.get(0);
    }

}

class runCode {
    public static void main(String[] args) {
        Stacks newStack = new Stacks();
        newStack.push(12);
        newStack.push(2);
        newStack.push(-9);
        newStack.push(0);
        newStack.push(4);
        newStack.push(1);
        newStack.printStack();
        System.out.println(newStack.peek());

    }
}