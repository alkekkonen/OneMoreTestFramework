package patterns.builder;

public class Person {

    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String nationality;

    public Person(
        final String lastName,
        final String firstName,
        final String streetAddress,
        final String city,
        final String nationality)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.nationality = nationality;

    }
}
