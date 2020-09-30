package com.school.javacore.oop.interfaces;

import java.util.ArrayList;

public interface SearchableModifiable {
    void addContact(Person p);
    void deleteContact(Person p);
    Person findContact(String phoneNumber);
    ArrayList<Person> listContacts();
}
