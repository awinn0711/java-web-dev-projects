package org.launchcode;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main (String[] args) {
        TrueFalse question1 = new TrueFalse("Is the earth round?", "true");
//        question1.askQuestion();
//        System.out.println(question1.getScore());
        MultipleChoice question2 = new MultipleChoice("What is the capital of Missouri?", "Jefferson City",
                new ArrayList<>());
        question2.allAnswers.add("St. Louis");
        question2.allAnswers.add("Kansas City");

//        question2.askQuestion();
//        System.out.println(question2.score);

        CheckBox question3 = new CheckBox("Which of these are primary colors?", new ArrayList<>(), new ArrayList<>());
        Collections.addAll(question3.wrongAnswers, "Purple", "Magenta");
        Collections.addAll(question3.correctAnswers, "Red", "Blue");
g//        question3.askQuestion();
//        System.out.println(question3.score);
//        System.out.println(question3.pointValue);

        Quiz testQuiz = new Quiz();
        testQuiz.trueFalses.add(question1);
        testQuiz.multipleChoices.add(question2);
        testQuiz.checkBoxes.add(question3);
        testQuiz.runQuiz();
    }
}
