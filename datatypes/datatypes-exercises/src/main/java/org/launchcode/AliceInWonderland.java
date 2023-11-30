package org.launchcode;
import java.util.Arrays;
import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of" +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it" +
                "had no pictures or conversations in it, 'and what is the use of a book,' thought Alice, " +
                "'without pictures or conversations?'";

        System.out.println("Enter a word you would like to search for: ");
        String searchTerm = input.nextLine().toLowerCase();
        input.close();
        //print true if search term is present or false if it is not present
        Boolean isPresent = sentence.toLowerCase().contains(searchTerm);
        System.out.println(isPresent);
        if(isPresent) {
            System.out.println("The word you searched starts at index " + sentence.indexOf(searchTerm) + " and" +
                    " has a length of " + searchTerm.length() + ".");
            String[] removedTerm = sentence.split(searchTerm);
            System.out.println("Here is the sentence with your word removed: " +Arrays.toString(removedTerm));
        }

    }
}
