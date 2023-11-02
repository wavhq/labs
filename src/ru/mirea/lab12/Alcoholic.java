package ru.mirea.lab12;

import java.util.*;

public class Alcoholic {
    private String cards_p1, cards_p2;

    public String getCards_p1() {
        return cards_p1;
    }

    public String getCards_p2() {
        return cards_p2;
    }

    public void setCards_p1(String cards_p1) {
        this.cards_p1 = cards_p1;
    }

    public void setCards_p2(String cards_p2) {
        this.cards_p2 = cards_p2;
    }

    public boolean isAnyDuplicates(String cards){
        ArrayList<Integer> cardsArray = new ArrayList<>();
        for (int i = 0; i<cards.length(); i++){
            int temp = Integer.parseInt(cards.substring(i, i+1));
            cardsArray.add(temp);
        }
        Collections.sort(cardsArray);
        for (int i = 0; i<cardsArray.size()-1; i++){
            if (cardsArray.get(i).equals(cardsArray.get(i+1))) return true;
        }
        return false;
    }

    public boolean isNumber(String value){
        try {
            Integer.parseInt(value);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public boolean moreThan(int num1, int num2){
        if (num1==0 && num2==9) return true;
        else if (num1==9 && num2==0) return false;
        else return num1>num2;
    }
    public String startStackGame() {
        Stack<Integer> cardsListP1 = new Stack<>();
        Stack<Integer> cardsListP2 = new Stack<>();
        Stack<Integer> deletedCardsListP1 = new Stack<>();
        Stack<Integer> deletedCardsListP2 = new Stack<>();

        for (int i = 4; i >= 0; i--) {
            cardsListP1.add(Integer.parseInt(cards_p1.substring(i, i + 1)));
            cardsListP2.add(Integer.parseInt(cards_p2.substring(i, i + 1)));
        }

        for (int i = 1; i < 106; i++) {
            int poppedP1 = cardsListP1.pop();
            int poppedP2 = cardsListP2.pop();
            if (moreThan(poppedP1, poppedP2)) {
                deletedCardsListP1.add(poppedP1);
                deletedCardsListP1.add(poppedP2);
            } else {
                deletedCardsListP2.add(poppedP1);
                deletedCardsListP2.add(poppedP2);
            }

            if (cardsListP1.empty()) {
                if (deletedCardsListP1.empty()) {
                    return "second " + i;
                } else {
                    while (!deletedCardsListP1.empty()) {
                        cardsListP1.add(deletedCardsListP1.pop());
                    }
                }
            }
            if (cardsListP2.empty()) {

                if (deletedCardsListP2.empty()) {
                    return "first " + i;
                } else {
                    while (!deletedCardsListP2.empty()) {
                        cardsListP2.add(deletedCardsListP2.pop());
                    }
                }
            }
            //System.out.println(i + " " + cardsListP1 + " " + cardsListP2); // Debug
        }
        return "botva";
    }

    public String startQueueGame(){
        Queue<Integer> cardsListP1 = new LinkedList<>();
        Queue<Integer> cardsListP2 = new LinkedList<>();

        for (int i = 0; i<5; i++){
            cardsListP1.add(Integer.parseInt(cards_p1.substring(i, i+1)));
            cardsListP2.add(Integer.parseInt(cards_p2.substring(i, i+1)));
        }

        for (int i = 1; i<106; i++){
            int poppedP1 = cardsListP1.poll();
            int poppedP2 = cardsListP2.poll();
            if (moreThan(poppedP1, poppedP2)){
                cardsListP1.add(poppedP1);
                cardsListP1.add(poppedP2);
            }
            else {
                cardsListP2.add(poppedP1);
                cardsListP2.add(poppedP2);
            }

            if (cardsListP1.isEmpty()){
                return "second " + i;
            }
            if (cardsListP2.isEmpty()){
                return "first " + i;
            }
            //System.out.println(i + " " + cardsListP1 + " " + cardsListP2); // Debug
        }
        return "botva";
    }
    public String startDequeueGame(){
        ArrayDeque<Integer> cardsListP1 = new ArrayDeque<>();
        ArrayDeque<Integer> cardsListP2 = new ArrayDeque<>();

        for (int i = 0; i<5; i++){
            cardsListP1.addLast(Integer.parseInt(cards_p1.substring(i, i+1)));
            cardsListP2.addLast(Integer.parseInt(cards_p2.substring(i, i+1)));
        }

        for (int i = 1; i<106; i++){
            int poppedP1 = cardsListP1.pop();
            int poppedP2 = cardsListP2.pop();
            if (moreThan(poppedP1, poppedP2)){
                cardsListP1.addLast(poppedP1);
                cardsListP1.addLast(poppedP2);
            }
            else {
                cardsListP2.addLast(poppedP1);
                cardsListP2.addLast(poppedP2);
            }

            if (cardsListP1.isEmpty()){
                return "second " + i;
            }
            if (cardsListP2.isEmpty()){
                return "first " + i;
            }
            //System.out.println(i + " " + cardsListP1 + " " + cardsListP2); // Debug
        }
        return "botva";
    }

}
