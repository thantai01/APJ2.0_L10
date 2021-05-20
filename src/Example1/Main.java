package Example1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PersonnelManager personManage = new PersonnelManager();

        Personnel ps1 = new Personnel("Nguyen van A", 28, 310013, "Hanoi");
        personManage.add(ps1);
        personManage.add(new Personnel("Nguyen van B", 29, 311113, "Hanoi"));

    }
}



