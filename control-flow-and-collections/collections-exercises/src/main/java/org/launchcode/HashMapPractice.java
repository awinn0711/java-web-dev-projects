package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students or press ENTER to finish: ");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.isEmpty()) {
                System.out.print("ID Number: ");
                Integer newId = input.nextInt();
                students.put(newId, newStudent);

                input.nextLine();
            }
        } while(!newStudent.isEmpty());
        input.close();

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Student ID: " + student.getKey() + ", Student Name: " + student.getValue());
        }
    }
}
