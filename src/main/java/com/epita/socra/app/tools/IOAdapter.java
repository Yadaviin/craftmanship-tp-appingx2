package com.epita.socra.app.tools;

/**
 * @author Emmanuel Chaffraix
 */
public interface IOAdapter {
    String read();

    void write(String message);
}
