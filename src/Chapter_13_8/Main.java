package Chapter_13_8;

class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(5);
        myStack.push(1);
        myStack.push(23);
        myStack.push(30);
        System.out.println(myStack);
        System.out.println("Size: " + myStack.getSize());
        System.out.println("Is Empty: " + myStack.isEmpty());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("GetElementByIndex: " + myStack.getElementByIndex(2));
    }
}
