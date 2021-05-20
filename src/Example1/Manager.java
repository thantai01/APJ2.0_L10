package Example1;

public interface Manager <T>{
    void add(T t);
    void display();
    int findIndex(int number);
    void delete(int number);
    void edit(int number, T t);
    void sortBy(T t);
}
