package com.epita.socra.app;

import com.epita.socra.app.tools.IOAdapter;
import org.junit.Test;

//import static org.junit.Assert.*;
//import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
    public void givenI_WhenRunningMain_ThenCheckOuput() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1");
        App app = new App(mock);
        app.run();

        verify(mock).write("I");
    }
}
