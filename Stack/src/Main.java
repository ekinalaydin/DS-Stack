public static void main(String[] args) {

    Stack myStack = new Stack(5);
    System.out.println("Before push():");
    System.out.println("--------------");
    myStack.printAll();
    myStack.push(6);

    System.out.println("\n\nAfter push():");
    System.out.println("-------------");
    myStack.printAll();
    System.out.println("-------------");

    myStack.push(4);
    System.out.println("Popped: ");

    // (2) Items - Returns 1 Node
    System.out.println(myStack.pop().value);
    // (1) Item - Returns 2 Node
    System.out.println(myStack.pop().value);
    // (0) Items - Returns null
    System.out.println(myStack.pop());


}
