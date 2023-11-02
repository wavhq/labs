package ru.mirea.lab14;

public class UnfairWaitList<E> extends WaitList {
    public UnfairWaitList() {

    }

    public void remove(E element) {
        if (!content.isEmpty() && element != content.peek()) {
            content.remove(element);
        }
    }

    public void moveToBack(E element){
        if (!content.isEmpty() && element==content.peek()){
            Object temp = content.poll();
            content.add(temp);
        }
    }
}
