public class TRY {
    public static void main(String[] args) {
        Node<Integer> n = new Node<>(23);
        lList<Integer> ll = new lList<>();
        ll.traverse(ll);

    }
}

class Node<F> {
    public F value;
    public Node<F> next;

    public Node(F VALUE) {
        this.value = VALUE;
        next = null;
    }
}

class lList<F> {
    public Node<F> head;
    public Node<F> tail;

    public lList() {
        this.head = null;
        this.tail = null;
    }

    public void traverse(lList<F> list) {
        Node<F> cN = list.head;
        while (cN != null) {
            System.out.print(cN.value + ", ");
            cN = cN.next;
        }
        System.out.println();
    }
}
// 3 -> 1 -> 9 -> 22