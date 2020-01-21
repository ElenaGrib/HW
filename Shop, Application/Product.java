import java.time.LocalDate;
import java.time.LocalTime;

public class Product {

    private int id = 0;
    private String name = null;
    private int price = 0;
    LocalDate date = null;
    LocalTime time = null;

    public Product (int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public int getPrice () {
        return price;
    }

    public String getDateTime () {
        return date.toString() + " " + time.toString();
    }
}
