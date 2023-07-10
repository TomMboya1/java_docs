package org.example;


/**
 * The WordGames class provides methods for word manipulation.
 * This class allows adding a greeting to a word and concatenating a person's name and surname.
 *
 * @author TOM MBOYA
 */
public class WordGames {

    /**
     * Adds a greeting to a word.
     *
     * @param word The word to which the greeting will be added.
     * @return The resulting string with the greeting.
     */
    public String addHelloWord(String word) {
        return "Hello " + word;
    }

    /**
     * Concatenates a person's name and surname.
     *
     * @param name The person's name.
     * @param surname The person's surname.
     * @return The full name of the person.
     */
    public String getFullName(String name, String surname) {
        return name + " " + surname;
    }
}
