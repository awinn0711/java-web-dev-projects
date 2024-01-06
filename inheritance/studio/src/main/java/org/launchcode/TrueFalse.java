package org.launchcode;

import java.util.Scanner;

public class TrueFalse extends Question {

    public final String correctAnswer;
    public TrueFalse(String question, String aCorrectAnswer) {
        super(question);
        correctAnswer = aCorrectAnswer;
    }
    public int getScore() {
        return this.score;
    }
    public String getCorrectAnswer(){
        return this.correctAnswer;
    }
    @Override
    public void askQuestion() {
        System.out.println(this.question);
        System.out.println("1.True \n 2.False");
        String userAnswer = input.next();
        if(userAnswer.toLowerCase().equals(correctAnswer.toLowerCase())) {
            this.score = 1;
        }
    }

}
