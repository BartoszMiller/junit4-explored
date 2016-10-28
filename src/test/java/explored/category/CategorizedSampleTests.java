package explored.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CategorizedSampleTests {

    @Test
    @Category(SlowTestCategory.class)
    public void slowRunningTest() {
        fail();
    }

    @Test
    @Category(QuickTestCategory.class)
    public void quickRunningTest() {
        assertTrue(true);
    }

}
