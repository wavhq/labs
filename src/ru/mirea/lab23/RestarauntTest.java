package ru.mirea.lab23;

public class RestarauntTest {
    public static void main(String[] args) {
        TablesOrderManager orderManager = new TablesOrderManager(10);
        Order[] orders = new Order[10];

        for (int i = 0; i < orders.length; i++) orders[i] = new Order();

        orders[2].add(new Dish(456, "Clock", "Не блюдо!"));
        orders[1].add(new Dish(123, "Plate", "Тарелка"));
        orders[1].add(new Dish(234, "Cup", "Кружка чая"));

        orderManager.add(orders[2], 3);
        orderManager.add(orders[1], 4);
        orderManager.removeOrder(3);
        orderManager.add(orders[1], 3);

        System.out.println(orderManager.ordersCostSummary());
        System.out.println(orderManager.freeTableNumbers());
        System.out.println(orderManager.freeTableNumber());
    }
}
