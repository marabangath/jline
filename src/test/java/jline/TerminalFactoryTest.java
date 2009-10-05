package jline;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

/**
 * Tests for the {@link TerminalFactory}.
 */
public class TerminalFactoryTest
{
    @Before
    public void setUp() throws Exception {
        TerminalFactory.reset();
    }

    @Test
    public void testConfigureNone() {
        TerminalFactory.configure("none");
        Terminal t = TerminalFactory.getTerminal();
        assertNotNull(t);
        assertEquals(UnsupportedTerminal.class.getName(), t.getClass().getName());
    }

    @Test
    public void testConfigureUnsupportedTerminal() {
        TerminalFactory.configure(UnsupportedTerminal.class.getName());
        Terminal t = TerminalFactory.getTerminal();
        assertNotNull(t);
        assertEquals(UnsupportedTerminal.class.getName(), t.getClass().getName());
    }
}