package com.pluralsight;

public class Program {
    public static void main(String[] args) {

        int totalRounds = 2;
        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("=== Round " + round + " ===");

            Player player1 = new Player("Player 1");
            Player player2 = new Player("Player 2");

            // Create and shuffle the deck
            Deck deck = new Deck();
            deck.shuffle();

            // Deal 2 cards to each player using your Hand's deal() method
            for (int i = 0; i < 2; i++) {
                player1.getHand().deal(deck.deal());
                player2.getHand().deal(deck.deal());
            }

        }
    }
}
