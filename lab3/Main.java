public class Main {
    public static void main(String[] args){
        Dish dish1 = new Dish(100, "salat", "obichniy");
        Dish dish2 = new Dish(200, "makaroni", "obichnie");
        Dish dish3 = new Dish(300, "sup", "obichniy");
        
        Dish[] dishes1 = {dish1, dish2};
        Dish[] dishes2 = {dish1, dish3, dish1};
        Dish[] dishes3 = {dish1};

        Order order1 = new Order(dishes1);
        Order order2 = new Order(dishes2);
        Order order3 = new Order(dishes3);

        RestaurantHashMap restaurantHashMap = new RestaurantHashMap();
        restaurantHashMap.addOrder(order1, 1);
        restaurantHashMap.addOrder(order2, 2);
        restaurantHashMap.addOrder(order3, 3);

        System.out.println(restaurantHashMap.findOrder(1));
        System.out.println(restaurantHashMap.findOrder(2));
        System.out.println(restaurantHashMap.findOrder(3));

        restaurantHashMap.removeOrder(1);
        restaurantHashMap.removeOrder(2);

        System.out.println(restaurantHashMap.findOrder(1));
        System.out.println(restaurantHashMap.findOrder(2));

    }
}
