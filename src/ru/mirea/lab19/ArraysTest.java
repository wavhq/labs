package ru.mirea.lab19;


import java.util.ArrayList;
import java.util.List;

public class ArraysTest {
    public static void main(String[] args) {
        String[] arrString = {"Adfs", "adfdsf", "GHks332fg", "asdjahfj", "GAGgd"};
        Integer[] arrInt = {8, 19, 28192, -912, 0};
        Arrays arrays = new Arrays();
        List<String> listString = arrays.convert(arrString);
        List<Integer> listInt = arrays.convert(arrInt);
        for (String s: listString) {
            System.out.println(s);
        }
        for (int s: listInt) {
            System.out.println(s);
        }

        arrays.setArrStorage(arrString);
        arrays.setArrStorage(arrInt);

        System.out.println(arrays.getElement(3));
        System.out.println(arrays.getElement(9));

        System.out.println("\nFrom file to list:");
        List<String> catalog = arrays.saver("C:\\Users\\Lenovo\\Documents\\text.txt");

        Solution<String, Integer, Character> solution = new Solution<>("type", 10, 'j');
        solution.newArrayList(arrString);
        Solution<Integer, String, Integer> solution2 = new Solution<>(15, "maaan", 100);
        solution2.newHashSet(arrInt);
        solution2.newHashMap(arrInt, arrString);
    }
}
