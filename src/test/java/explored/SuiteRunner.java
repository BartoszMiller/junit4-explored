package explored;


import explored.assertions.AssertionsBasics;
import explored.assertions.AssertionsWithMatchers;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AssertionsBasics.class, AssertionsWithMatchers.class})
public class SuiteRunner {

}
