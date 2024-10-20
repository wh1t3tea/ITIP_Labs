
import java.util.HashMap;

public class RestaurantHashMap {
    HashMap<Integer, Order> table;

    public RestaurantHashMap(){
        table = new HashMap<>();
    }
    public void addOrder(Order order, int id){
        table.put(id, order);
    }
    public void removeOrder(int id){
        table.remove(id);
    }
    public Order findOrder(int id){
        return table.get(id);
    }
}
