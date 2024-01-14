package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;

public class MultipleChoice extends Question {

    public final String correctAnswer;
    public ArrayList<String> allAnswers = new ArrayList<>();
    public MultipleChoice(String question, String aCorrectAnswer, ArrayList<String> someAnswers){
        super(question);
        correctAnswer = aCorrectAnswer;
        someAnswers = allAnswers;
    }
    @Override
    public void askQuestion() {
        allAnswers.add(correctAnswer);
//        Randomizes answer array
        Collections.shuffle(allAnswers);
        System.out.println(question);
        for(String answer : allAnswers) {
            System.out.println((allAnswers.indexOf(answer)+1) + ". " + answer);
        }
            System.out.println("Enter the number corresponding to the correct answer.");
        int userAnswer = input.nextInt();
        if (userAnswer == (allAnswers.indexOf(correctAnswer) +1)) {
            this.score = 1;
        }

    }

}
