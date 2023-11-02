package ru.mirea.lab4;

public class Human {
    public class Head{
        private String eyeColor;
        Head(String eyeColor){
            this.eyeColor = eyeColor;
        }

        @Override
        public String toString() {
            return "Head{" +
                    "eyeColor='" + eyeColor + '\'' +
                    '}';
        }
    }
    public class Leg{
        private int footSize;

        public Leg(int footSize) {
            this.footSize = footSize;
        }

        @Override
        public String toString() {
            return "Leg{" +
                    "footSize=" + footSize +
                    '}';
        }
    }
    public class Hand{
        private int handSize;

        public Hand(int handSize) {
            this.handSize = handSize;
        }

        @Override
        public String toString() {
            return "Hand{" +
                    "handSize=" + handSize +
                    '}';
        }
    }
    private Head head;
    private Leg leftLeg, rightLeg;
    private Hand leftHand, rightHand;
    Human(String eyeColor, int footSize, int handSize){
        head = new Head(eyeColor);
        rightHand = new Hand(handSize);
        leftHand = new Hand(handSize);
        rightLeg = new Leg(footSize);
        leftLeg = new Leg(footSize);
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                ", leftHand=" + leftHand +
                ", rightHand=" + rightHand +
                '}';
    }
}
