package patterns;

import patterns.builder.Person;
import patterns.builder.PersonBuilder;

public class Sandbox {

    public static void main(String[] args) {

        Person person = new PersonBuilder()
            .setFirtName("Ivan")
            .setLastName("Ivanovsky")
            .setCity("Samara")
            .setStreetAddresse("Lenina 25")
            .setNationality("Russian")
            .build();

    }

}
