package com.company;

import java.io.IOException;
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
        int counter = 1;

        while (!exit.equalsIgnoreCase("nein")){   // loop until player wants to exit
            System.out.println(ANSI_YELLOW + "|| Runde " + counter + ". ||" + ANSI_RESET); // fancy thing to express the round number
            System.out.println(ANSI_PURPLE + "Spieler 1" + ANSI_RESET + " ist dran!"); // output demand
            String one = scanner.next(); // saves the input of player 1
            System.out.println(ANSI_BLUE + "Spieler 2" + ANSI_RESET + " ist dran!"); // output demand
            String two = scanner.next(); // saves the input of player 2

            Game game = new Game(one, two); // game object for OOP ;)
            game.checkwin(); // method to compare both inputs
            System.out.println(ANSI_RED + "\nWillst du nochmal spielen? JA ODER NEIN ?!!?! ... ANTWORTE DOCH MAN" + ANSI_RESET); // output question
            exit = scanner.next(); // every input except "no" gets ignored --> while-loop

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n"); // "clear the board"
            counter ++;
        }
    }
}
