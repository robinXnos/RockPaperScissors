package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1, its your turn!");
        String one = scanner.next();
        System.out.println("Player 2, its your turn!");
        String two = scanner.next();

        Game game = new Game (one, two);
        game.checkwin();
    }
}
