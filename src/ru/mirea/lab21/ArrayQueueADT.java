package ru.mirea.lab21;

public class ArrayQueueADT<T> {
    private int size;
    private int trueNumberOfElement;
    Object[] objects;
    ArrayQueueADT(int size) {
        this.size = size;
        this.trueNumberOfElement = 0;
        this.objects = new Object[size];
    }
    public void enqueue(T t) {
        int i = 0;
        while (this.objects[i] != null) {
            i++;
        }
        this.objects[i] = t;
        this.trueNumberOfElement++;
    }
    public T element() {
        return (T)this.objects[0];
    }
    public T dequeue() {
        T t = (T)this.objects[0];
        for (int i = 0; i < this.trueNumberOfElement - 1; i++) {
            this.objects[i] = this.objects[i+1];
        }
        this.objects[this.trueNumberOfElement-1] = null;
        this.trueNumberOfElement--;
        return t;
    }
    public int size() {
        return this.trueNumberOfElement;
    }
    public boolean isEmpty() {
        if (this.trueNumberOfElement == 0) {
            return true;
        }
        return false;
    }
    public void clear() {
        int i = 0;
        while (this.objects[i] != null) {
            this.objects[i] = null;
            i++;
        }
        this.trueNumberOfElement = 0;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < this.trueNumberOfElement; i++) {
            result += this.objects[i] + " ";
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        ArrayQueueADT<Integer> queue = new ArrayQueueADT<>(5);
        queue.enqueue(10);
        queue.enqueue(16);
        queue.enqueue(52);
        queue.enqueue(23);
        queue.enqueue(55);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.element());
        System.out.println(queue.element());
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);
    }
}
