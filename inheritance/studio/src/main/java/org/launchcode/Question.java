package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {
    public String question;
    public final String correctAnswer;
    public int score;
    Scanner input = new Scanner(System.in);

    public Question(String aQuestion, String ACorrectAnswer) {
        question = aQuestion;
        correctAnswer = ACorrectAnswer;
    }
    public abstract void askQuestion();
}
