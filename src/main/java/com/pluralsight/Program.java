package com.pluralsight;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Player 1's name: ");
        String name1 = scanner.nextLine().trim();

        System.out.print("Enter Player 2's name: ");
        String name2 = scanner.nextLine().trim();

        for (int round = 1; round <= 2; round++) {
            System.out.println("=== Round " + round + " ===");

            Player player1 = new Player(name1);
            Player player2 = new Player(name2);

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

            printWinner(player1, score1, player2, score2);
        }
    }

    private static void printWinner(Player player1, int score1, Player player2, int score2) {
        if (score1 > 21 && score2 > 21) {
            System.out.println("Result: Both went over 21! No winners.");
        } else if (score1 > score2) {
            System.out.println("Result: " + player1.getName() + " wins!");
        } else if (score2 > score1) {
            System.out.println("Result: " + player2.getName() + " wins!");
        } else {
            System.out.println("Result: It's a tie!");
        }
    }
}