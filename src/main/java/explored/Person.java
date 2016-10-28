package explored;

import java.util.List;

public class Person {

    private final String firstName;
    private final List<String> interests;


    public Person(String firstName, List<String> interests) {
        this.firstName = firstName;
        this.interests = interests;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<String> getInterests() {
        return interests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!firstName.equals(person.firstName)) return false;
        return interests.equals(person.interests);

    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + interests.hashCode();
        return result;
    }
}
