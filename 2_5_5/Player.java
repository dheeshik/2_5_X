//package Project_251_252;

import java.util.Scanner;

public class Player {
    // Attributes
    private String name;
    private double points;

    /**
     * Constructs a new player and initializes their name.
     */
    public Player() {
        initializeName();
        points = 0.0;
        System.out.println("Hello and welcome to the game, " + name);
    }

    /**
     * Initialize the player's name by getting input from the user.
     */
    private void initializeName() {
        System.out.println("Enter Player Name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    }

    /**
     * Get the player's name.
     *
     * @return The player's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the player's current points.
     *
     * @return The player's points.
     */
    public double getPoints() {
        return points;
    }

    /**
     * Set the player's name to a new value.
     *
     * @param newName The new name for the player.
     */
    public void setName(String newName) {
        name = newName;
    }
}
