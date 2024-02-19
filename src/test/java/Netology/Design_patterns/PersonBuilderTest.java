package Netology.Design_patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonBuilderTest {
    PersonBuilder pb = new PersonBuilder();

    @Test
    void setAgeException() {
        assertThrows(IllegalArgumentException.class, () -> pb.setAge(-5));
    }

    @Test
    void buildException() {
        assertThrows(IllegalStateException.class, () -> pb.build());
    }
}