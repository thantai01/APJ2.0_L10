package demoList;

import java.util.Arrays;
import java.util.ListIterator;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY_LIST =10;
    private Object[] elements;

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY_LIST];
    }
    public void ensureCapacity() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e) {
        if (size== elements.length) {
            ensureCapacity();
        }
        elements[size] = e;
        size++;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
class myListTest {
    public static void main(String[] args) {
        MyList<Integer> integerList = new MyList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        System.out.println(integerList.get(5));
        System.out.println(integerList.get(3));
        System.out.println(integerList.get(1));
        integerList.get(-1);
        System.out.println(integerList.get(-1));
    }
}
