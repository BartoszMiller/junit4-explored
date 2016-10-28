package explored;

import org.hamcrest.core.AnyOf;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class ParameterizedRunner {

    @Parameters(name = "Test execution for index={index}")
    public static Collection<Integer> data() {
        return Arrays.asList(1, 2, 3);
    }

    @Parameter
    public int parameter;

    @Test
    public void executeForData() {
        assertThat(parameter, AnyOf.anyOf(Is.is(1), Is.is(2), Is.is(3)));
    }

}
