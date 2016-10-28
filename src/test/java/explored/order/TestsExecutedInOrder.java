package explored.order;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestsExecutedInOrder {

    private static String flag = null;

    @Test
    public void a() {
        assertEquals(flag, null);
        flag = "a";
    }

    @Test
    public void b() {
        assertEquals(flag, "a");
        flag = "b";
    }

    @Test
    public void c() {
        assertEquals(flag, "b");
        flag = "c";
    }

    @Test
    public void d() {
        assertEquals(flag, "c");
    }
}
