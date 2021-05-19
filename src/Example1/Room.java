package Example1;

public class Room {
    private int id;
    private int size;
    private int price;

    public Room(int id, int size, int price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }

    public Room() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room { " +
                "id=" + id +
                ", size=" + size +
                ", price=" + price +
                "}";
    }
}
