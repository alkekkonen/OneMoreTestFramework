package patterns.builder;

public class Person {

    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String nationality;

    public Person(
        final String firstName,
        final String lastName,
        final String streetAddress,
        final String city,
        final String nationality)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.nationality = nationality;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name = " + firstName + " " + lastName + "]";
    }
}
