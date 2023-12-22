package org.launchcode;

import java.util.Scanner;

public class TrueFalse extends Question {
    private String correctAnswer;
    private String userAnswer;
    private int score;

    public TrueFalse(String question, String correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }

    private int questionAndAnswers() {
        askQuestion();
        System.out.println("1.True \n 2.False");
        userAnswer = input.nextLine();
        if(userAnswer.toLowerCase() == correctAnswer.toLowerCase()) {
            score = 1;
        }
        return score;
    }

}
