package org.launchcode;

import java.util.Scanner;

public class TrueFalse extends Question {

    public final String correctAnswer;
    public TrueFalse(String question, String aCorrectAnswer) {
        super(question);
        correctAnswer = aCorrectAnswer;
    }
    public String getCorrectAnswer(){
        return this.correctAnswer;
    }
    @Override
    public void askQuestion() {
        System.out.println(this.question + " \nEnter True or False") ;
        String userAnswer = input.next();
        if(userAnswer.equalsIgnoreCase(correctAnswer)) {
            this.score = 1;
        }
    }

}
