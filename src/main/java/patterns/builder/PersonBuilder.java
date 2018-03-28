package patterns.builder;

public class PersonBuilder {

    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String nationality;


    public PersonBuilder() {
    }

    public PersonBuilder setFirtName(String firstName) {
        this.firstName = firstName;
        return this;

    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;

    }

    public PersonBuilder setStreetAddresse(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;

    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;

    }

    public PersonBuilder setNationality(String nationality) {
        this.nationality = nationality;
        return this;

    }

    public Person build(){
        return new Person(firstName, lastName, streetAddress, city, nationality);
    }

}
