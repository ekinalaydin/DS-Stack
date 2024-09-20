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
    public void push (int value){
        Node newNode = new Node(value);
        if(height == 0){ // If the stack is empty, set the new node as the top
            top = newNode;
        }else{
            newNode.next = top; // Otherwise, set the next node of the new node as the current top node,
            // and then set the new node as the new top node
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(height == 0){
            return null;
        }else{
            Node temp;
            temp = top;
            top = top.next;
            temp.next = null;
            height--;
            return temp;

        }
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (height == 0) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
        System.out.println("Height:" + height);
        System.out.println("\nStack:");
        if (height == 0) {
            System.out.println("empty");
        } else {
            printStack();
        }
    }

    public void makeEmpty() {
        top = null;
        height = 0;
    }
}