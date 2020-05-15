package com.epita.socra.app;

import com.epita.socra.app.tools.IOAdapter;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

//import static org.mockito.Answers.valueOf;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.ArgumentMatchers.argThat;
/**
 * Unit test for simple App.
 */
public class AppTest {


    /**
     * Manage case when user enters nothing.
     */
    @Test
    public void givenNoInput_WhenRunningMain_ThenCheckOutputError() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("");
        App app = new App(mock);
        app.run();
        verify(mock).write("You did not enter a number!");
    }

    /**
     * Manage case when user enters both text chars and numerals.
     */
    @Test
    public void givenMix_WhenRunningMain_ThenCheckOutputError() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("MC231");
        App app = new App(mock);
        app.run();
        verify(mock).write("This is neither a roman nor an arabic number!");
    }

}
