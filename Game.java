package com.company;

public class Game {
    String one;
    String two;
    public Game(String one, String two) {
        this.one = one;
        this.two = two;
    }

    public void checkwin(){
        if (one.equals(two))
            System.out.println("draw");
        else if  (one.equals("rock") && two.equals("paper"))
            System.out.println("two wins");
        else if (one.equals("rock") && two.equals("scissors"))
            System.out.println("one wins");
        else if (one.equals("paper") && two.equals("rock"))
            System.out.println("one wins");
        else if (one.equals("paper") && two.equals("scissors"))
            System.out.println("two wins");
        else if (one.equals("scissors") && two.equals("paper"))
            System.out.println("one wins");
        else if (one.equals("scissors") && two.equals("rock"))
            System.out.println("two wins");
        else
            System.out.println("typo, restart the game silly");
    }
}
