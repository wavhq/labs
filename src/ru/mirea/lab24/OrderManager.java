package ru.mirea.lab24;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderManager {
    private Order[] orders;
    private HashMap<String, Order> addressAndOrder;
    OrderManager(int tableNumber) {
        if (tableNumber < 0)
            throw new IllegalTableNumber("Table number cant be less than 0");
        orders = new Order[tableNumber];
        this.addressAndOrder = new HashMap<>();
    }
    OrderManager(int tableNumber, HashMap<String, Order> addressAndOrder) {
        if (tableNumber < 0)
            throw new IllegalTableNumber("Table number cant be less than 0");
        orders = new Order[tableNumber];
        this.addressAndOrder = addressAndOrder;
    }
    public void add(Order order, int tableNumber) {
        if ((tableNumber > orders.length) || (tableNumber < 0))
            throw new IllegalTableNumber("Table number is out of bounds");
        else if (orders[tableNumber] != null)
            throw new OrderAlreadyAddedException("This table is booked");
        orders[tableNumber] = order;
    }
    public void add(String address, Order order) {
        addressAndOrder.put(address, order);
    }
    public Order getOrder(int tableNumber) {
        if ((tableNumber > orders.length) || (tableNumber < 0))
            throw new IllegalTableNumber("Table is out of bounds");
        return orders[tableNumber];
    }
    public Order getOrder(String address) {
        return addressAndOrder.get(address);
    }
    public void removeOrder(int tableNumber) {
        if ((tableNumber > orders.length) || (tableNumber < 0))
            throw new IllegalTableNumber("Table is out of bounds");
        orders[tableNumber] = null;
    }
    public void removeOrder(String address) {
        addressAndOrder.remove(address);
    }
    public void addItem(Item item, int tableNumber) {
        if ((tableNumber > orders.length) || (tableNumber < 0))
            throw new IllegalTableNumber("Table is out of bounds");
        orders[tableNumber].add(item);
    }

    public void addItem(String address, Item item) {
        addressAndOrder.get(address).add(item);
    }
    public int freeTableNumber() {
        int count = 0;
        for (Order order : orders)
            if (order == null)
                count++;
        return count;
    }
    public ArrayList<Integer> freeTableNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < orders.length; i++)
            if (orders[i] == null)
                numbers.add(i);
        return numbers;
    }
    public Order[] getRestaurantOrders() {
        return orders;
    }
    public HashMap<String, Order> getInternetOrders() {
        return addressAndOrder;
    }
    public double restaurantOrdersCostSummary() {
        double result = 0.0;
        for (Order order : orders) {
            if (order != null)
                result += order.costTotal();
        }
        return result;
    }
    public double internetOrdersCostSummary() {
        double result = 0.0;
        int size = addressAndOrder.size();
        for (Order order : addressAndOrder.values()) {
            result += order.costTotal();
        }
        return result;
    }
    public int internetItemQuantity(String itemname) {
        int count = 0;
        int size = addressAndOrder.size();
        for (Order order : addressAndOrder.values())
            for (Item item : order.getItems())
                if (item.getName() == itemname)
                    count++;
        return count;
    }
    public int restaurantItemQuantity(String itemname) {
        int count = 0;
        int size = orders.length;
        for (int i = 0; i < size; i++)
            if (orders[i] != null)
                for (Item item : orders[i].getItems())
                    if (item.getName() == itemname)
                        count++;
        return count;
    }
}
