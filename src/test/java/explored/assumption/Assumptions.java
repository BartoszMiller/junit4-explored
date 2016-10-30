package explored.assumption;


import org.hamcrest.core.Is;
import org.junit.Test;

import java.io.File;

import static org.junit.Assume.assumeThat;

public class Assumptions {

    @Test
    public void runIntegrationTestsOnlyWhenOnDevEnvironmentOnLinux() {

        assumeThat(File.separatorChar, Is.is('/'));
        assumeThat(System.getProperty("ENV"), Is.is("INTEGRATIONS_TESTS"));

        longRunningIntegrationTests();
    }

    private void longRunningIntegrationTests() {
        // ...
    }

}
