package com.epita.socra.app.translators;

import com.epita.socra.app.tools.Translators;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for numeral to roman.
 */
public class NumeralToRomanTest {

    /**
     * Test one to I.
     */
    @Test
    public void given1_WhenRunningMain_ThenCheckOuput() {
        assertEquals(Translators.numeralToRoman(1), "I");
    }

    /**
     * Manage case when user enters 5.
     */
    @Test
    public void given5_WhenRunningMain_ThenCheckOutput() {
        assertEquals(Translators.numeralToRoman(5), "V");
    }
}
