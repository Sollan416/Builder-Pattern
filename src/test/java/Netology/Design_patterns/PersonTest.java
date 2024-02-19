package Netology.Design_patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person1 = new Person("Test", "Test", 0);
    Person person2 = new Person("Test", "Test", 0);
    Person person3 = new Person("Test", "Text", 5);


    @Test
    void happyBirthday() {
        person1.happyBirthday();
        assertEquals(1, person1.age);
    }

    @Test
    void newChildBuilder() {
        person1.setAddress("Moscow");
        PersonBuilder result = person1.newChildBuilder();

        assertTrue(person1.getSurname().equals(result.surname) &
                person1.age == 0 & person1.getAddress().equals(result.address));
    }

    @Test
    void testHashCode() {
        assertTrue(person1.hashCode() == person2.hashCode() &
                person1.hashCode() != person3.hashCode());
    }
}