package Example1;

import java.util.*;

public class PersonnelManager {
    List<Personnel> personnelArrayList = new ArrayList<>();

    public void add(Personnel personnel) {
        personnelArrayList.add(personnel);
    }
    public void display() {
        for (Personnel personnel : personnelArrayList) {
            System.out.println(personnel);
        }
    }
    public int findIndex(int id) {
        for (int i = 0; i < personnelArrayList.size();i++) {
            if(personnelArrayList.get(i).getId()==id) {
                return i;
            }
        } return -1;
    }
    public void edit(int id, Personnel personnel) {
        int indexOfPerson = findIndex(id);
        if(indexOfPerson == -1) {
            System.out.println("Person not found");
        } else personnelArrayList.set(indexOfPerson, personnel);
    }
    public void delete(int id, Personnel personnel) {
        int indexOfPerson = findIndex(id);
        if(indexOfPerson ==-1) {
            System.out.println("Person not found");
        } else personnelArrayList.remove(indexOfPerson);
    }
    public void sortByName() {
        Collections.sort(personnelArrayList);
    }
}


