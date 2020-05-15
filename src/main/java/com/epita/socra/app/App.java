package com.epita.socra.app;

import com.epita.socra.app.tools.ConsoleAdapter;
import com.epita.socra.app.tools.IOAdapter;
import com.epita.socra.app.tools.Translators;

/**
 * Hello world.
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Main function.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.run();
    }

    /**
     * Runs the program.
     * User is prompted to enter a argument 
     */
    public void run() {
        adapter.write("Hello, enter a roman or arabic numeral.");
        String input = adapter.read();

        if (input == "") {
            adapter.write("You did not enter a number!");
        } else if (input.chars().allMatch(Character::isDigit)) {
            adapter.write(Translators.numeralToRoman(Integer.parseInt(input)));
        } else if (input.chars().allMatch(Character::isAlphabetic)) {
            adapter.write(String.valueOf(Translators.romanToNumeral(input)));
        }

    }

}