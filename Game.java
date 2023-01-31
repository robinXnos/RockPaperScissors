package com.company;

public class Game {
    String player1;
    String player2;
    String typo;
    
    public Game(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void checkWin(){
        if (player1.equalsIgnoreCase(player2))
            System.out.println(player1 + " schlägt " + player2 + "\n --> unentschieden"); // draw
        else if  (player1.equalsIgnoreCase("stein") && player2.equalsIgnoreCase("papier"))
            System.out.println(player2 + " schlägt " + player1 + "\nSpieler 2 gewinnt");
        else if (player1.equalsIgnoreCase("stein") && player2.equalsIgnoreCase("schere"))
            System.out.println(player1 + " schlägt " + player2 + "\nSpieler 1 gewinnt");
        else if (player1.equalsIgnoreCase("papier") && player2.equalsIgnoreCase("stein"))
            System.out.println(player1 + " schlägt " + player2 + "\nSpieler 1 gewinnt");
        else if (player1.equalsIgnoreCase("papier") && player2.equalsIgnoreCase("schere"))
            System.out.println(player2 + " schlägt " + player1 + "\nSpieler 2 gewinnt");
        else if (player1.equalsIgnoreCase("schere") && player2.equalsIgnoreCase("papier"))
            System.out.println(player1 + " schlägt " + player2 + "\nSpieler 1 gewinnt");
        else if (player1.equalsIgnoreCase("schere") && player2.equalsIgnoreCase("stein"))
            System.out.println(player2 + " schlägt " + player1 + "\nSpieler 2 gewinnt");
        else {
            typo = (!player1.equalsIgnoreCase("stein") && !player1.equalsIgnoreCase("schere") && player1.equalsIgnoreCase("papier")) ? player2 : player1; // checks if one is a typo and saves input as typo, else saves two as typo
            System.out.println("Es gibt kein '" + typo +"' dulli! Schreib mal vernünftig");
        }
    }
}
