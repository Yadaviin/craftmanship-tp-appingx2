package com.epita.socra.app;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;
import com.epita.socra.app.tools.Translators;
import org.junit.Test;

//import static org.mockito.Answers.valueOf;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.ArgumentMatchers.argThat;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /*
        @Test
        public void givenAMock_WhenRunningMain_ThenCheckOuputs() {
            IOAdapter mock = mock(IOAdapter.class);
            when(mock.read()).thenReturn("TEST");
            App app = new App(mock);
            app.run();

            verify(mock).write("Hello, what's your name ?");
            verify(mock).write(argThat(message -> message.contains("TEST")));
        }
    */

    /**
     * Test one to I.
     */
    @Test
    public void given1_WhenRunningMain_ThenCheckOuput() {
        assertEquals(Translators.numeralToRoman(1), "I");
    }

    /**
     * Manage case when user enters nothing.
     */
    @Test
    public void givenNoInput_WhenRunningMain_ThenCheckOutput() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("");
        App app = new App(mock);
        app.run();
        verify(mock).write("You did not enter a number!");
    }

    /**
     * Manage case when user enters 5.
     */
    @Test
    public void given5_WhenRunningMain_ThenCheckOutput() {
        assertEquals(Translators.numeralToRoman(5), "V");
    }

    /**
     * Manage case when user enters I.
     */
    @Test
    public void givenI_WhenRunningMain_ThenCheckOutput() {
        assertEquals(Translators.romanToNumeral("I"), 1);
    }

    /**
     * Manage case when user enters V.
     */
    @Test
    public void givenV_WhenRunningMain_ThenCheckOutput() {
        assertEquals(Translators.romanToNumeral("V"), 5);
    }

    /**
     * Manage case when user enters X.
     */
    @Test
    public void givenX_WhenRunningMain_ThenCheckOutput() {
        assertEquals(Translators.romanToNumeral("X"), 10);
    }

    /**
     * Manage case when user enters XXI.
     */
    @Test
    public void givenXXI_WhenRunningMain_ThenCheckOutput() {
        assertEquals(Translators.romanToNumeral("XXI"), 21);
    }

    /**
     * Manage case when user enters bogus roman numerals.
     */
    @Test
    public void givenBogus_WhenRunningMain_ThenCheckOutput() {
        assertEquals(Translators.romanToNumeral("CDZHHF"), -1);
    }
}
