package com.epita.socra.app.tools;

import java.util.Scanner;

/**
 * Contains read and write, two useful tools for the rest of the code.
 * 
 * @author Emmanuel Chaffraix
 */
public class ConsoleAdapter implements IOAdapter {

    private Scanner scan = new Scanner(System.in);

    @Override
    public String read() {
        return scan.nextLine();
    }

    @Override
    public void write(String message) {
        System.out.println(message);
    }

}
