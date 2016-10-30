package explored.rules;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.*;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class TestsWithRules {

    @ClassRule
    public static Timeout timeoutPerClass = Timeout.millis(1000);

    @Rule
    public RuleChain chainWithCustomRules
            = RuleChain.outerRule(new CustomLoggingRule("Outer custom Rule")).around(new CustomLoggingRule("Inner custom Rule"));

    @Rule
    public Timeout timeoutPerMethod = Timeout.millis(1000);

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Rule
    public TestName testName = new TestName();

    @Test
    public void createTmpFolderAndFileWithRule() throws IOException {

        File dir = temporaryFolder.newFolder("dir");
        File file = temporaryFolder.newFile("file");

        assertTrue(dir.exists());
        assertTrue(file.exists());
    }

    @Test
    @Ignore("Test is ignored as a demonstration of ErrorCollector")
    public void collectMultipleAssertionErrorsAndLogCombinedFailure() {

        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            errorCollector.addError(e);
        }

        errorCollector.checkThat(true, IsEqual.equalTo(false));
        errorCollector.checkThat("john", IsEqual.equalTo("barry"));
    }

    @Test
    public void accessTestNameInATest() {
        assertThat(testName.getMethodName(), Is.is("accessTestNameInATest"));
    }
}
