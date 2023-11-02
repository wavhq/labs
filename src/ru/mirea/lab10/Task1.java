package ru.mirea.lab10;

public class Task1 {
    public int triangleSequence(int num, int last){
        if (num == last+1) return 0;
        for(int i = 0; i < num; i++){
            System.out.print(num + " ");
        }
        return triangleSequence(num+1, last);
    }
}
