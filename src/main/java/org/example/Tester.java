package org.example;

/**
 * The Tester class is used to test the functionality of the WordGames class.
 * It creates a WordGames object and invokes its methods to demonstrate their usage.
 *
 * @author Your Name
 */
public class Tester {

    /**
     * The main method creates a WordGames object and tests its methods.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();

        String greeting = wordGames.addHelloWord("world");
        System.out.println(greeting);

        String fullName = wordGames.getFullName("tom ", "mboya");
        System.out.println(fullName);


    }
}
