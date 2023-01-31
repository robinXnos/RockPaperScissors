package com.company;

import java.util.Scanner;


public class Main {
    public static final String ANSI_RED = "\u001B[31m";     // color for output
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner object
        String exit = "yes"; // useless
        int round = 1;

        while (!exit.equalsIgnoreCase("nein")){   // loop until player wants to exit
            System.out.println(ANSI_YELLOW + "|| Runde " + round + ". ||" + ANSI_RESET); // fancy thing to express the round number
            System.out.println(ANSI_PURPLE + "Spieler 1" + ANSI_RESET + " ist dran!"); // output demand
            String player1 = scanner.next(); // saves the input of player 1
            System.out.println(ANSI_BLUE + "Spieler 2" + ANSI_RESET + " ist dran!"); // output demand
            String player2 = scanner.next(); // saves the input of player 2

            Game game = new Game(player1, player2); // game object for OOP ;)
            game.checkWin(); // method to compare both inputs
            System.out.println(ANSI_RED + "\nWillst du nochmal spielen? JA ODER NEIN ?!!?! ... ANTWORTE DOCH MAN" + ANSI_RESET); // output question
            exit = scanner.next(); // every input except "no" gets ignored --> while-loop
            for (int i = 0; i < 30; i++)
                System.out.println();       // clear the board
            round ++;
        }
    }
}
