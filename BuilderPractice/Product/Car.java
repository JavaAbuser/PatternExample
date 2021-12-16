package BuilderPractice.Product;

public class Car {
    private String name;
    private int price;
    private int year;

    public Car(String name, int price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
