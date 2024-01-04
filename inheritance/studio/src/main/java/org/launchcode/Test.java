package org.launchcode;
import java.util.ArrayList;
public class Test {
    public static void main (String[] args) {
//        TrueFalse question1 = new TrueFalse("Is the earth round?", "true");
//        question1.askQuestion();
//        System.out.println(question1.getScore());
        MultipleChoice question2 = new MultipleChoice("What is the capital of Missouri?", "Jefferson City",
                new ArrayList<>());
        question2.allAnswers.add("St. Louis");
        question2.allAnswers.add("Kansas City");

        question2.askQuestion();
        System.out.println(question2.score);

    }
}
