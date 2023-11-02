package ru.mirea.lab16;

public class Exception1 {

    //Шаг 1 - программа ведет себя так, потому что не в состоянии делить на ноль, следовательно завершиться ей не удается и она выбрасывает исключение ArithmeticException
    //Шаг 2 - программа выдает результат Infinity
    //Шаг 3 - мы перехватываем исключение типа ArithmeticException и выводим ошибку в консоль, программа при этом дорабатывает до конца
    public void exceptionDemo() {
       try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 e = new Exception1();
        e.exceptionDemo();
    }
}
