package explored.exception;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionalSituations {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test(expected = IndexOutOfBoundsException.class)
    public void usingExpected() {
        new ArrayList<>().get(0);
    }

    @Test
    public void usingTryCatch() {
        try {
            new ArrayList<>().get(0);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertThat(e.getMessage(), Is.is("Index: 0, Size: 0"));
        }
    }

    @Test
    public void usingRule() {

        expectedException.expect(IndexOutOfBoundsException.class);
        expectedException.expectMessage("Index: 0, Size: 0");
        expectedException.expectCause(IsNull.nullValue(Throwable.class));

        new ArrayList<>().get(0);
    }
}
