package com.epita.socra.app.tools;

/**
 * IOAdapter.
 * @author Emmanuel Chaffraix
 */
public interface IOAdapter {
    String read();

    void write(String message);
}
