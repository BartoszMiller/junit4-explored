package explored;


import explored.assertions.AssertionsBasics;
import explored.assertions.AssertionsWithMatchers;
import explored.exception.ExceptionalSituations;
import explored.order.TestsExecutedInOrder;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AssertionsBasics.class,
        AssertionsWithMatchers.class,
        ExceptionalSituations.class,
        TestsExecutedInOrder.class})
public class SuiteRunner {

}
