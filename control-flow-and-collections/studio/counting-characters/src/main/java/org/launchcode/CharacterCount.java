package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main (String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. Once " +
                "you’ve done that, it’s pretty straightforward from there.";
        HashMap<String, Integer> characterMap = new HashMap<>();
        char[] charArray = myString.toCharArray();
//        System.out.println(charArray);
        for (char i : charArray) {
            characterMap.put(Character.toString(i), 0);
        }

        for (Map.Entry<String, Integer> character : characterMap.entrySet()) {
            for (char i : charArray) {
                String letter = Character.toString(i);
                if (letter.equals(character.getKey())) {
                   Integer count = character.getValue();
                   count ++;
                   characterMap.put(letter, count);


                }

            }
        }
        System.out.println(characterMap);
    }
}
