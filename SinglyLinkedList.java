public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    

    public void remove() {
        Node current_node = head;
        while (current_node.next.next != null){
            current_node = current_node.next;
        }
        current_node.next = null;
    }

    public void printValues() {
        Node current_node = head;
        while (current_node.next != null) {
            System.out.println(current_node.value);
            current_node = current_node.next;
        }
        System.out.println(current_node.value);
    }
}
