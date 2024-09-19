public class Stack {
    private Node top;
    private int height;

    class Node {
        int value; // stores the value of the node
        Node next; // stores the reference to the next node in the stack

        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {

        Node newNode = new Node(value);
        top = newNode; // set the new node as the top of the stack
        height = 1;
    }
}