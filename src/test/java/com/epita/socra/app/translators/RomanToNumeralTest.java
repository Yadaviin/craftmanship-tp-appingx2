package com.epita.socra.app.translators;

import com.epita.socra.app.tools.Translators;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for Translator.
 */
public class RomanToNumeralTest {

    /**
     * Manage case when user enters I.
     */
    @Test
    public void givenI_WhenTranslating_ThenCheckOutput() {
        assertEquals(1, Translators.romanToNumeral("I"));
    }

    /**
     * Manage case when user enters V.
     */
    @Test
    public void givenV_WhenTranslating_ThenCheckOutput() {
        assertEquals(5, Translators.romanToNumeral("V"));
    }

    /**
     * Manage case when user enters X.
     */
    @Test
    public void givenX_WhenTranslating_ThenCheckOutput() {
        assertEquals(10, Translators.romanToNumeral("X"));
    }

    /**
     * Manage a standard addition.
     */
    @Test
    public void givenXXI_WhenTranslating_ThenCheckOutput() {
        assertEquals(21, Translators.romanToNumeral("XXI"));
    }

    /**
     * Manage a standard substraction.
     */
    @Test
    public void givenIV_WhenTranslating_ThenCheckOutput() {
        assertEquals(4, Translators.romanToNumeral("IV"));
    }

    /**
     * Manage case when user enters bogus roman numerals.
     */
    @Test
    public void givenBogus_WhenTranslating_ThenCheckOutput() {
        assertEquals(-1, Translators.romanToNumeral("CDZHHF"));
    }

}
