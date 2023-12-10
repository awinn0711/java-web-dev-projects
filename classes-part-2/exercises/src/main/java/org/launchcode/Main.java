package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Student bob = new Student("Bob");
        Student bill = new Student("Bill");
        ArrayList<Student> musicClass = new ArrayList<>();
        musicClass.add(bob);
        musicClass.add(bill);
        Teacher bonJovi = new Teacher("Jon", "BonJovi", "music", 17);
        Course music = new Course("Music", bonJovi, musicClass);

        System.out.println(music.toString());
    }
}
