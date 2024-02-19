package Netology.Design_patterns;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return age != -1;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder pb = new PersonBuilder();
        pb.setSurname(surname);
        pb.setAge(0);
        pb.setAddress(address);
        return pb;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age + ", живёт в " + address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}