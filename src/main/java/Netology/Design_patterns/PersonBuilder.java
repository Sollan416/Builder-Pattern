package Netology.Design_patterns;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age = -1;
    protected String address;

    // Возвращаемым является сам Builder, чтобы сделать возможным цепной вызов сеттеров.
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < -1)
            throw new IllegalArgumentException("Введён некорректный возраст");

        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null)
            throw new IllegalStateException("Не указаны имя и/или фамилия");

        Person person = new Person(name, surname, age);
        if (address != null)
            person.setAddress(address);
        return person;
    }
}