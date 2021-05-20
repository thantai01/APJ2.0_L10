package Example1;

import java.util.Comparator;

public class Personnel implements Comparable<Personnel> {
    private String name;
    private int age;
    private int id;
    private String hometown;

    public Personnel() { }

    public Personnel(String name, int age, int id, String hometown) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", hometown='" + hometown + '\'' +
                '}';
    }


    @Override
    public int compareTo(Personnel personnel) {
        return this.getName().compareTo(personnel.getName());
    }
}
