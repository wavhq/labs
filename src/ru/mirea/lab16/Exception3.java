package ru.mirea.lab16;

import java.util.Scanner;

public class Exception3 {

    //Неправильная постановка задачи, так как при добавлении общего исключения
    //в начале списка программа даже не скомпилируется!
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch(Exception e){
            System.out.println("Exception caught!");
        }
//        catch(ArithmeticException e){
//            System.out.println("Division by zero!");
//        }
//        catch (NumberFormatException e){
//            System.out.println("Not an Integer number!");
//        }

    }

    public static void main(String[] args) {
        Exception3 e = new Exception3();
        e.exceptionDemo();
    }
}
