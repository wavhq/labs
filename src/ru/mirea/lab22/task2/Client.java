package ru.mirea.lab22.task2;

public class Client {
    public Chair chair;
    public void sit() {
        System.out.println("Клиент сел");
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
