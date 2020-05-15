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
     * Manage case when user enters L.
     */
    @Test
    public void givenL_WhenTranslating_ThenCheckOutput() {
        assertEquals(50, Translators.romanToNumeral("L"));
    }

    /**
     * Manage case when user enters C.
     */
    @Test
    public void givenC_WhenTranslating_ThenCheckOutput() {
        assertEquals(100, Translators.romanToNumeral("C"));
    }

    /**
     * Manage case when user enters D.
     */
    @Test
    public void givenD_WhenTranslating_ThenCheckOutput() {
        assertEquals(500, Translators.romanToNumeral("D"));
    }

    /**
     * Manage case when user enters M.
     */
    @Test
    public void givenM_WhenTranslating_ThenCheckOutput() {
        assertEquals(1000, Translators.romanToNumeral("M"));
    }

    /**
     * Manage a standard addition.
     */
    @Test
    public void givenII_WhenTranslating_ThenCheckOutput() {
        assertEquals(2, Translators.romanToNumeral("II"));
    }

    /**
     * Manage a more complex addition.
     */
    @Test
    public void givenXX_WhenTranslating_ThenCheckOutput() {
        assertEquals(20, Translators.romanToNumeral("XX"));
    }

    /**
     * Manage a more complex addition.
     */
    @Test
    public void givenCCXXII_WhenTranslating_ThenCheckOutput() {
        assertEquals(222, Translators.romanToNumeral("CCXXII"));
    }

    /**
     * Manage a standard substraction.
     */
    @Test
    public void givenIV_WhenTranslating_ThenCheckOutput() {
        assertEquals(4, Translators.romanToNumeral("IV"));
    }

    /**
     * Manage more complicated substraction.
     */
    @Test
    public void givenLXXXIX_WhenTranslating_ThenCheckOutput() {
        assertEquals(89, Translators.romanToNumeral("LXXXIX"));
    }

    /**
     * Manage non-compliant roman numeral: IL.
     */
    @Test
    public void givenBad_WhenTranslating_ThenCheckOutput() {
        assertEquals(-1, Translators.romanToNumeral("IL"));
    }

    /**
     * Manage non-compliant roman numeral: IIII.
     */
    @Test
    public void givenBad2_WhenTranslating_ThenCheckOutput() {
        assertEquals(-1, Translators.romanToNumeral("IIII"));
    }

    /**
     * Manage case when user enters only bogus roman numerals.
     */
    @Test
    public void givenBogus_WhenTranslating_ThenCheckOutput() {
        assertEquals(-1, Translators.romanToNumeral("DZHHF"));
    }

    /**
     * Manage case when user enters real and then bogus roman numerals.
     */
    @Test
    public void givenRealAndBogus_WhenTranslating_ThenCheckOutput() {
        assertEquals(-1, Translators.romanToNumeral("CDZHHF"));
    }
}
