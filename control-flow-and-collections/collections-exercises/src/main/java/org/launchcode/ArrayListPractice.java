package org.launchcode;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        //call sumEven
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            integers.add(i);
        }
        System.out.println(ArrayListPractice.sumEven(integers));

        //convert phrase from ArrayPractice into ArrayList
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will " +
                "not eat them in a house. I will not eat them with a mouse.";
        String[] stringSplit = phrase.split(" ");
        ArrayList<String> phraseList = new ArrayList<>(Arrays.asList(stringSplit));
        //call wordSearch on the ArrayList
        ArrayListPractice.wordSearch(phraseList);

    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }

    public static void wordSearch(ArrayList<String> arr) {
        ArrayList<String> searchResults = new ArrayList<>();
        int wordLength;
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters are in the words you are searching for?");
        wordLength = input.nextInt();

        for (String word : arr) {
            if (word.length() == wordLength) {
                searchResults.add(word);
            } else if (word.length() == (wordLength + 1) && word.contains(".")) {
                searchResults.add(word);
            } else if (word.length() == (wordLength + 1) && word.contains(",")) {
                searchResults.add(word);
            }
        }
        System.out.println(searchResults);
    }
}
