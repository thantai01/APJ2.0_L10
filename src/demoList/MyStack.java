package demoList;

public class MyStack <E> {
    private static final int INITIAL_SIZE = 10;
    private E[] elements;
    private int count =0;

    public MyStack() {
        this.elements = (E[])new Object[INITIAL_SIZE];
    }
    public void push(E e){
        ensureCap();
        elements[count] = e;
        count++;
    }

    private void ensureCap() {
        if(count>= elements.length) {
            E[] newElements = (E[]) new Object[elements.length*2+1];
            System.arraycopy(elements,0,newElements,0,count);
            elements = newElements;
        }
    }
}
