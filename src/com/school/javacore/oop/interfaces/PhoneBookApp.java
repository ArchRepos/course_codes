package com.school.javacore.oop.interfaces;

import java.util.Scanner;

public class PhoneBookApp {

    public static void main(String [] args){
        PhoneBook pb = new PhoneBook();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Name Surname PhoneNumber");
        String line = userInput.nextLine();
        String[] splittedLine = line.split(" ");
        Person p = new Person(splittedLine[0], splittedLine[1], splittedLine[2]);
        pb.addContact(p);

      //  System.out.println(pb.findContact(p.getPhoneNumber()));
        System.out.println(pb.listContacts());
    }
}
