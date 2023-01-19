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
            System.out.println(one + " against " + two + "\n --> draw");
        else if  (one.equalsIgnoreCase("rock") && two.equalsIgnoreCase("paper"))
            System.out.println(two + " beats " + one + "\nPlayer two wins");
        else if (one.equalsIgnoreCase("rock") && two.equalsIgnoreCase("scissors"))
            System.out.println(one + " beats " + two + "\nPlayer one wins");
        else if (one.equalsIgnoreCase("paper") && two.equalsIgnoreCase("rock"))
            System.out.println(one + " beats " + two + "\nPlayer one wins");
        else if (one.equalsIgnoreCase("paper") && two.equalsIgnoreCase("scissors"))
            System.out.println(two + " beats " + one + "\nPlayer two wins");
        else if (one.equalsIgnoreCase("scissors") && two.equalsIgnoreCase("paper"))
            System.out.println(one + " beats " + two + "\nPlayer one wins");
        else if (one.equalsIgnoreCase("scissors") && two.equalsIgnoreCase("rock"))
            System.out.println(two + " beats " + one + "\nPlayer two wins");
        else {
            typo = (!one.equalsIgnoreCase("rock") && !one.equalsIgnoreCase("paper") && one.equalsIgnoreCase("scissors")) ? two : one;
            System.out.println("Theres no such thing as '" + typo +"' silly!");
        }
    }
}
