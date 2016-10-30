package explored.theory;

import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class TheoriesRunner {

    private static int rangeCrossProductCounter = 0;

    @AfterClass
    public static void verifyRangeCrossProductCounter() {
        assertThat(rangeCrossProductCounter, Is.is(10000));
    }

    @After
    public void countTests(){
        rangeCrossProductCounter++;
    }

    @Theory
    public void additionIsCommutativeTheorem(@Range(from = 1, to = 100) int a, @Range(from = 1, to = 100) int b) {
        assertTrue(a + b == b + a);
    }
}
