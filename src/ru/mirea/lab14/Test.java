package ru.mirea.lab14;

public class Test {
    public static void main(String[] args) {
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(3);
        boundedWaitList.add(1);
        boundedWaitList.add(2);
        boundedWaitList.add(3);
        boundedWaitList.add(4); //Заметим, что элемент не добавился, так как максимальная вместимость = 3
        System.out.println("Вместимость boundedListWait = " + boundedWaitList.getCapacity());
        System.out.println(boundedWaitList);
        boundedWaitList.remove();
        System.out.println(boundedWaitList);

        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add("One");
        unfairWaitList.add("Two");
        unfairWaitList.add("Three");
        unfairWaitList.add("Four");
        System.out.println(unfairWaitList);
        unfairWaitList.remove("Two");
        System.out.println("Попытка удалить не первый элемент в списке: " + unfairWaitList);
        unfairWaitList.remove("One");
        System.out.println("Попытка удалить первый элемент в списке: " + unfairWaitList);
        unfairWaitList.moveToBack("One");
        System.out.println("Переместим первый элемент в конец: " + unfairWaitList);
    }
}
