class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T Data) {
        this.data = Data;
        next = null;
    }
}

public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void printLinkedList(LinkedList<T> list) {
        Node<T> curNode = list.head;
        while (curNode != null) {
            System.out.print("|" + curNode.data + "|");
            if (curNode.next != null) {
                System.out.print("-->");
            }
            curNode = curNode.next;

        }
        System.out.println();

    }

    public LinkedList<T> insert(LinkedList<T> list, T data) {
        // Create a new node with given data
        Node<T> new_node = new Node<T>(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node<T> last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    public static void main(String[] args) {

        LinkedList<Integer> lList = new LinkedList<>();

        lList.insert(lList, 23);
        lList.insert(lList, -9);
        lList.insert(lList, 1);
        lList.printLinkedList(lList);
        System.out.println("..............");

        LinkedList<String> sList = new LinkedList<>();
        sList.insert(sList, "null");
        sList.insert(sList, "Emma");
        sList.insert(sList, "Mary");
        sList.insert(sList, "Elisha");
        sList.insert(sList, "David");
        sList.printLinkedList(sList);

    }

}
