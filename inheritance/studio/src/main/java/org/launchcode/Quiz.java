package org.launchcode;

import java.util.ArrayList;

public class Quiz {
    public ArrayList<TrueFalse> trueFalses = new ArrayList<>();
    public ArrayList<MultipleChoice> multipleChoices = new ArrayList<>();
    public ArrayList<CheckBox> checkBoxes = new ArrayList<>();
    public double totalPoints;
    public double score;

    public Quiz(){};

    public void runQuiz() {
        for(TrueFalse trueFalseQuestion : trueFalses) {
            trueFalseQuestion.askQuestion();
            this.score += trueFalseQuestion.score;
            this.totalPoints ++;
        }
        for(MultipleChoice multipleChoiceQuestion : multipleChoices) {
            multipleChoiceQuestion.askQuestion();
            this.score += multipleChoiceQuestion.score;
            this.totalPoints ++;
        }
        for(CheckBox checkBoxQuestion : checkBoxes) {
            checkBoxQuestion.askQuestion();
            this.score += checkBoxQuestion.score;
            this.totalPoints += checkBoxQuestion.pointValue;
        }
        double finalScore = this.score / this.totalPoints * 100;
        System.out.println("Your score is: " + finalScore + "%" );
    }

}
