package explored.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TestsWithRules {

    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    @Test
    public void withTimeout() throws InterruptedException {
        Thread.sleep(100);
    }
}
