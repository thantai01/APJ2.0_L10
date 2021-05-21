package demoStackWithLinkedList;

public class GenericStackClient {

    public void stackOfStrings(String string) {
        MyGenericStack<String> stringStack = new MyGenericStack<>();
        stringStack.push(string);
        System.out.println("Size of stack after push " + stringStack.size());
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop() + ", ");
        }
        System.out.println("Size after pop " + stringStack.size());
    }
    public void stackOfIntegers(int number) {
        MyGenericStack<Integer> integerStack = new MyGenericStack<>();
        integerStack.push(number);
        System.out.println("Size of stack "+ integerStack.size());
        while(!integerStack.isEmpty()) {
            System.out.println(integerStack.pop() + " ,");
        }
        System.out.println("Size for now " + integerStack.size());
    }
}
