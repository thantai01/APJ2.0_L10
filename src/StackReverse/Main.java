package StackReverse;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> iStack = new Stack<>();
        iStack.push(1);
        iStack.push(2);
        iStack.push(3);
        iStack.push(4);
        iStack.push(5);
        System.out.println("iStack :"+iStack);
        System.out.println("Size "+iStack.size());
        System.out.print("iStack after pop : ");
//        Stack<Integer> newIStack = new Stack<>();
        while (!iStack.isEmpty()) {
            iStack.pop();
//            newIStack.push(iStack.pop());
        }
        System.out.println(iStack);
//        System.out.print("Reverse: ");
//        System.out.println(newIStack);
    }
}
