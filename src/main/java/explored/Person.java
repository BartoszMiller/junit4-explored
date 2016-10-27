package explored;

import java.util.List;

class Person {

    private final String firstName;
    private final List<String> interests;


    Person(String firstName, List<String> interests) {
        this.firstName = firstName;
        this.interests = interests;
    }

    String getFirstName() {
        return firstName;
    }

    List<String> getInterests() {
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
