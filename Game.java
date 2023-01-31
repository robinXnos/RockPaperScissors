package com.company;

public class Game {
    String one;
    String two;
    String typo;
    public Game(String one, String two) {
        this.one = one;
        this.two = two;
    }

    public void checkwin(){

        if (one.equalsIgnoreCase(two))
            System.out.println(one + " schlägt " + two + "\n --> unentschieden"); // draw
        else if  (one.equalsIgnoreCase("stein") && two.equalsIgnoreCase("papier"))
            System.out.println(two + " schlägt " + one + "\nSpieler 2 gewinnt");
        else if (one.equalsIgnoreCase("stein") && two.equalsIgnoreCase("schere"))
            System.out.println(one + " schlägt " + two + "\nSpieler 1 gewinnt");
        else if (one.equalsIgnoreCase("papier") && two.equalsIgnoreCase("stein"))
            System.out.println(one + " schlägt " + two + "\nSpieler 1 gewinnt");
        else if (one.equalsIgnoreCase("papier") && two.equalsIgnoreCase("schere"))
            System.out.println(two + " schlägt " + one + "\nSpieler 2 gewinnt");
        else if (one.equalsIgnoreCase("schere") && two.equalsIgnoreCase("papier"))
            System.out.println(one + " schlägt " + two + "\nSpieler 1 gewinnt");
        else if (one.equalsIgnoreCase("schere") && two.equalsIgnoreCase("stein"))
            System.out.println(two + " schlägt " + one + "\nSpieler 2 gewinnt");
        else {
            typo = (!one.equalsIgnoreCase("stein") && !one.equalsIgnoreCase("schere") && one.equalsIgnoreCase("papier")) ? two : one; // checks if one is a typo and saves input as typo, else saves two as typo
            System.out.println("Es gibt kein '" + typo +"' dulli! Schreib mal vernünftig");
        }
    }
}
