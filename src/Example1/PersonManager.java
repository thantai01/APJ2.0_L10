package Example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class PersonManager<E> {
    LinkedList<Personnel> personnelLinkedList = new LinkedList<>();
    ArrayList<Personnel> personnelArrayList = new ArrayList<>();

    void add(Personnel personnel) {
        personnelArrayList.add(personnel);
        personnelLinkedList.add(personnel);
    }
    void display() {
        for (Personnel personnel : personnelArrayList) {
            System.out.println(personnel);
        }
    }
    void edit() {
        ListIterator<Personnel> listIterator = personnelLinkedList.listIterator();

    }
}

