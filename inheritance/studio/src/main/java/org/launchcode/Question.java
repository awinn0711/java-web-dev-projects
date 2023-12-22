package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {
    private String question;
    Scanner input = new Scanner(System.in);

    public Question(String aQuestion) {
        question = aQuestion;
    }
    public void askQuestion() {
        System.out.println(question);

    }
}
