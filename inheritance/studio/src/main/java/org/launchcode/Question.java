package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {
    public String question;
    public double score;
    Scanner input = new Scanner(System.in);

    public Question(String aQuestion) {
        question = aQuestion;
    }
    public abstract void askQuestion();
}
