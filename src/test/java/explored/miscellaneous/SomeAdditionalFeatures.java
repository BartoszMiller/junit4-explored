package explored.miscellaneous;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.fail;

public class SomeAdditionalFeatures {

    @Ignore("Test is ignored as a demonstration")
    @Test
    public void ignored() {
        fail();
    }

    @Test(timeout = 10)
    public void withTimeout() throws InterruptedException {
        Thread.sleep(5);
    }
}
