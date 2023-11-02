package ru.mirea.lab24;

public class RestaurantTest {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager(10);
        Order[] orders = new Order[10];

        for (int i = 0; i < orders.length; i++) orders[i] = new RestaurantOrder();

        orders[1].add(new Dish(123,"Plate", "Now time to check this"));
        orders[2].add(new Drink(234,"Cup", "Кружка чая"));
        orders[4].add(new Drink(345,"Cup", "Кружка кофе"));

        orderManager.add(orders[1], 8);
        orderManager.add(orders[2], 4);
        orderManager.add(orders[4],1);
        orderManager.add("1", orders[2]);

        System.out.println(orderManager.getOrder("1").getItems());
        System.out.println(orderManager.freeTableNumbers());
    }
}
