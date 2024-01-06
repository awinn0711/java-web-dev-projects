package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;

public class CheckBox extends Question {

    ArrayList<String> wrongAnswers = new ArrayList<>();
    ArrayList<String> correctAnswers = new ArrayList<>();
    ArrayList<String> allAnswers = new ArrayList<>();
    Integer pointValue = 0;

    public CheckBox(String question, ArrayList<String> wrongAnswers, ArrayList<String> correctAnswers){
        super(question);
        this.wrongAnswers = wrongAnswers;
        this.correctAnswers = correctAnswers;
    }

    @Override
    public void askQuestion() {
        ArrayList<Integer> userAnswers = new ArrayList<>();
        //add wrong and right answers into new array and update question pointValue
        allAnswers.addAll(wrongAnswers);
        allAnswers.addAll(correctAnswers);
        this.pointValue = correctAnswers.size();
        //randomize answer array
        Collections.shuffle(allAnswers);
        System.out.println(question);
        for(String answer : allAnswers) {
            System.out.println((allAnswers.indexOf(answer)+1) + ". " + answer);
        }
        System.out.println("Enter the number corresponding to the correct answer. There is more than one correct answer.");
        for(int j = 0; j < correctAnswers.size(); j++){
            userAnswers.add(input.nextInt());
        }
        for(int userAnswer : userAnswers) {
            if(correctAnswers.contains(allAnswers.get((userAnswer-1)))){
                this.score += 1;
            }
        }

    }
}
