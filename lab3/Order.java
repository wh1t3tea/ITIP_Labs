import java.util.Arrays;

public class Order {
    private int totalPrice;
    private Dish[] dishes;

    public Order(Dish[] dishes) {
        for (Dish dish: dishes) {
            totalPrice += dish.getPrice();
        }
        this.dishes = dishes;
    }

    public Dish[] getDishes(){
        return dishes;
    }

    @Override
    public String toString() {
        return "Order [totalPrice=" + totalPrice + ", dishes=" + Arrays.toString(dishes) + "]";
    }
}
