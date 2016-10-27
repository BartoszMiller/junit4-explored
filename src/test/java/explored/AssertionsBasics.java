package explored;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsBasics {

    @Test
    public void assertEquals_Test() {

        assertEquals(true, true);
        assertNotEquals(true, false);
    }

    @Test
    public void assertNull_Test() {

        assertNull(null);
        assertNotNull(new Object());
    }

    @Test
    public void assertTrue_Test() {

        assertTrue(true);
        assertFalse(false);
    }

    @Test
    public void assertSame_Test() {

        Object object = new Object();

        assertSame(object, object);
        assertNotSame(object, new Object());
    }
}
