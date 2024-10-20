public class Dish {
    private int price;
    private String name;
    private String description;

    public Dish(int price, String name, String description){
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Dish [price=" + price + ", name=" + name + ", description=" + description + "]";
    }
}
