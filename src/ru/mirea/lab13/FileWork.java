package ru.mirea.lab13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWork {
    static Scanner sc = new Scanner(System.in);
    public static class WriteToFile{
        public WriteToFile(String route, boolean append, String text){
            try(FileWriter fileWriter = new FileWriter(route, append)){
                fileWriter.write(text);
            }
            catch (IOException ex){
                System.out.println("File have broken ;(");
            }
        }
    }

    public static class ReadFromFile{
        public ReadFromFile(String route){
            try (FileReader reader = new FileReader(route)){
                int c;
                while ((c = reader.read())!=-1) System.out.print((char)c);
            }
            catch (IOException ex){
                System.out.println("File have broken ;(");
            }
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        System.out.println("Выберите режим работы программы:\n1. Запись в файл\n2. Вывод из файла\n3. Замена инф-ы в файле\n4. Добавить в конец файла текст");
        while(true){
            choice = sc.nextInt();
            if (choice>=1 && choice<=4) break;
            else System.out.print("Ошибка, введите значение от 1 до 4! Попробуйте снова: ");
        }
        switch (choice){
            case 1:{
                System.out.print("Введите текст для записи в файл: ");
                String text = sc.next();
                new WriteToFile("C:\\Users\\Lenovo\\Documents\\text.txt", false, text);
            }break;
            case 2:{
                System.out.println("Будет выведен текст из файла \"C:\\Users\\Lenovo\\Documents\\text.txt\"");
                new ReadFromFile("C:\\Users\\Lenovo\\Documents\\text.txt");
            }break;
            case 3:{
                System.out.print("Введите текст для перезаписи в файл: ");
                String text = sc.next();
                new WriteToFile("C:\\Users\\Lenovo\\Documents\\text.txt", false, text);
            }break;
            case 4:{
                System.out.print("Введите текст для дозаписи в файл: ");
                String text = sc.next();
                new WriteToFile("C:\\Users\\Lenovo\\Documents\\text.txt", true, text);
            }break;
            default: break;
        }
    }
}
