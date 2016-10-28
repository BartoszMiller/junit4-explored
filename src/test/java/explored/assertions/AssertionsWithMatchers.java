package explored.assertions;

import explored.Person;
import org.hamcrest.core.*;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThat;

public class AssertionsWithMatchers {

    private final Person johnSmith = new Person("John", Arrays.asList("music", "sport"));

    @Test
    public void IsNull() {

        assertThat(null, IsNull.nullValue());
        assertThat(johnSmith, IsNull.notNullValue());
    }

    @Test
    public void Is() {

        assertThat(johnSmith.getFirstName(), Is.is("John"));
        assertThat(johnSmith.getFirstName(), Is.isA(String.class));
    }

    @Test
    public void AllOf_AnyOf() {

        assertThat(johnSmith.getFirstName(), AllOf.allOf(StringStartsWith.startsWith("Jo"), StringEndsWith.endsWith("hn")));
        assertThat(johnSmith.getFirstName(), AnyOf.anyOf(Is.is("John"), Is.is("Bradley")));
    }

    @Test
    public void StringContains_StringEndsWith_StringStartsWith() {

        assertThat(johnSmith.getFirstName(), StringContains.containsString("ohn"));
        assertThat(johnSmith.getFirstName(), StringEndsWith.endsWith("hn"));
        assertThat(johnSmith.getFirstName(), StringStartsWith.startsWith("Jo"));
    }


    @Test
    public void IsEqual_IsInstanceOf() {

        assertThat(johnSmith, IsEqual.equalTo(new Person("John", Arrays.asList("music", "sport"))));
        assertThat(johnSmith, IsInstanceOf.instanceOf(Person.class));

    }

    @Test
    public void CombinableMatcher_IsCollectionContaining() {

        assertThat(johnSmith.getFirstName(), CombinableMatcher.both(IsInstanceOf.instanceOf(String.class)).and(IsEqual.equalTo("John")));
        assertThat(johnSmith.getInterests(), IsCollectionContaining.hasItems("sport", "music"));
    }

    @Test
    public void Every() {

        assertThat(johnSmith.getInterests(), Every.everyItem(Is.isA(String.class)));
    }
}
