package ru.mirea.lab6.Furniture;

import java.util.ArrayList;

public class FurnitureShop {

    public static void main(String[] args) {
        ArrayList<Furniture> allFurnitureInShop = new ArrayList<>();
        Wardrobe wardrobe1 = new Wardrobe("Brown", "oak");
        Wardrobe wardrobe2 = new Wardrobe("Light brown", "birch");
        Table table1 = new Table("White", "plastic");
        Table table2 = new Table("Black", "glass");
        allFurnitureInShop.add(wardrobe1);
        allFurnitureInShop.add(wardrobe2);
        allFurnitureInShop.add(table1);
        allFurnitureInShop.add(table2);
        System.out.println("All availiable furniture now: ");
        for (Furniture f: allFurnitureInShop) {
            System.out.println(f.getID());
        }
    }
}
