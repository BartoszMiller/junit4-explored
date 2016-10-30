package explored.theory;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.ArrayList;
import java.util.List;

public class RangeSupplier extends ParameterSupplier {

    @Override
    public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable {

        List<PotentialAssignment> values = new ArrayList<>();

        Range range = sig.getAnnotation(Range.class);
        for (int i = range.from(); i <= range.to(); i++) {
            values.add(PotentialAssignment.forValue("range", i));
        }

        return values;
    }
}
