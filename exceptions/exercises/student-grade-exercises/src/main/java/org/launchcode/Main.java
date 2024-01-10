package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(6,3);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String, String> student : studentFiles.entrySet()) {
            CheckFileExtension(student.getValue());
        }
    }

    public static void Divide(int x, int y)
    {
        if(y == 0) {
            try {
                throw new ArithmeticException("You cannot divide by zero");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        System.out.println(x/y);
    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        if(fileName.equals(null) || fileName.isEmpty()) {
            try {
                throw new CheckFileExtensionException("File extension is empty or null");
            } catch (CheckFileExtensionException e) {
                e.printStackTrace();
            }
            return -1;
        }
        else if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }

    }
}