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

    // **************TRAVERSAL**************

    // Method to print the LinkedList.
    public void printLinkedList(LinkedList<T> list) {
        Node<T> curNode = list.head;
        while (curNode != null) {
            System.out.print("|" + curNode.data + "|");
            // if (curNode.next != null) {
            System.out.print("-->");
            // }
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

    // **************DELETION BY KEY**************

    // Method to delete a node in the LinkedList by KEY
    public LinkedList<T> deleteByKey(LinkedList<T> list,
            T key) {
        // Store head node
        Node<T> currNode = list.head, prev = null;

        //
        // CASE 1:
        // If head node itself holds the key to be deleted

        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(key + " found and deleted");

            // Return the updated List
            return list;
        }

        //
        // CASE 2:
        // If the key is somewhere other than at head
        //

        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null && currNode.data != key) {
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }

        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;

            // Display the message
            System.out.println(key + " found and deleted");
        }

        //
        // CASE 3: The key is not present
        //

        // If key was not present in linked list
        // currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }

        // return the List
        return list;
    }

    public static void main(String[] args) {

        LinkedList<Integer> lList = new LinkedList<>();

        lList.insert(lList, 23);
        lList.insert(lList, -9);
        lList.insert(lList, 1);
        lList.printLinkedList(lList);
        System.out.println("..............");
        lList.deleteByKey(lList, 23);
        lList.printLinkedList(lList);

        LinkedList<String> sList = new LinkedList<>();
        sList.insert(sList, "Dick and Gee");
        sList.insert(sList, "Emma");
        sList.insert(sList, "Mary");
        sList.insert(sList, "Elisha");
        sList.insert(sList, "David");
        sList.printLinkedList(sList);
        System.out.println("..............");

    }

}
