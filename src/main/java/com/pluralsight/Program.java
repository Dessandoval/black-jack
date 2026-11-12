package com.pluralsight;

public class Program {
    public static void main(String[] args) {

        for (int round = 1; round <= 2; round++) {
            System.out.println("=== Round " + round + " ===");

            Player player1 = new Player("Player 1");
            Player player2 = new Player("Player 2");

            Deck deck = new Deck();
            deck.shuffle();

            for (int i = 0; i < 2; i++) {
                player1.getHand().deal(deck.deal());
                player2.getHand().deal(deck.deal());
            }
            int score1 = player1.getHand().getValue();
            int score2 = player2.getHand().getValue();

            System.out.println(player1.getName() + " Hand: " + player1.getHand() + " Total Score: " + score1);
            System.out.println(player2.getName() + " Hand: " + player2.getHand() + " Total Score: " + score2);
        }
    }
}
