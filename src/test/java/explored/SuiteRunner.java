package explored;


import explored.assertion.AssertionsBasics;
import explored.assertion.AssertionsWithMatchers;
import explored.assumption.Assumptions;
import explored.exception.ExceptionalSituations;
import explored.miscellaneous.SomeAdditionalFeatures;
import explored.order.TestsExecutedInOrder;
import explored.rules.TestsWithRules;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AssertionsBasics.class,
        AssertionsWithMatchers.class,
        Assumptions.class,
        ExceptionalSituations.class,
        SomeAdditionalFeatures.class,
        TestsExecutedInOrder.class,
        TestsWithRules.class})
public class SuiteRunner {

}
