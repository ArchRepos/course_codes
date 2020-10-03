package com.school.javacore.oop.interfaces;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBookApp {

    public static void main(String [] args){
        /*PhoneBook pb = new PhoneBook();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Name Surname PhoneNumber");
        String line = userInput.nextLine();
        String[] splittedLine = line.split(" ");
        Person p = new Person(splittedLine[0], splittedLine[1], splittedLine[2]);
        pb.addContact(p);

      //  System.out.println(pb.findContact(p.getPhoneNumber()));
        System.out.println(pb.listContacts());*/

        Person[] persons = new Person[3];
        Person p1 = new Person("Zach", "Surname1", "222-222-222", 21);
        Person p2 = new Person("Will", "Surname2", "222-222-223", 17);
        Person p3 = new Person("Jane", "Surname3", "222-222-224", 22);
        persons[0] = p1;
        persons[1] = p2;
        persons[2] = p3;

        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        //System.out.println( " "+(persons[0].getFirstName() > persons[1].getFirstName()));
    }
}
