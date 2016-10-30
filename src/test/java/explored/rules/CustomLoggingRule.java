package explored.rules;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

class CustomLoggingRule implements TestRule {

    private final String message;

    CustomLoggingRule(String message) {
        this.message = message;
    }

    @Override
    public Statement apply(Statement base, Description description) {
        System.out.println(message);
        return base;
    }
}
