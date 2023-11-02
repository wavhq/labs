package ru.mirea.lab12;

import java.util.Scanner;

public class AlcoholicGameTest {
    public static void main(String[] args) {
        Alcoholic game = new Alcoholic();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first player's 5 cards (use only 0-9 with no duplicate values): ");
        while (true){
            game.setCards_p1(scanner.nextLine());
            if (game.getCards_p1().length()!=5 || !game.isNumber(game.getCards_p1())){
                System.out.println("Error! Enter 5 numbers 0-9 with no spaces! Try again: ");
            }
            else if (game.isAnyDuplicates(game.getCards_p1())){
                System.out.println("Error! You must enter values with no duplicates! Try again: ");
            }
            else break;
        }

        System.out.println("Enter second player's 5 cards (use only 0-9 with no duplicate values): ");
        while (true){
            game.setCards_p2(scanner.nextLine());
            if (game.getCards_p2().length()!=5 || !game.isNumber(game.getCards_p2())){
                System.out.println("Error! Enter 5 numbers 0-9 with no spaces! Try again: ");
            }
            else if (game.isAnyDuplicates(game.getCards_p2())){
                System.out.println("Error! You must enter values with no duplicates! Try again: ");
            }
            else if (game.isAnyDuplicates(game.getCards_p1()+game.getCards_p2())){
                System.out.println("Error! You must enter values with no duplicates between 2 players! Try again: ");
            }
            else break;
        }

        System.out.println(game.startStackGame());
        System.out.println(game.startQueueGame());
        System.out.println(game.startDequeueGame());
    }
}
