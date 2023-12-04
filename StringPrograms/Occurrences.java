package StringPrograms;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int[] characterCountArray = countCharacters(inputString);

        // Display the character count
        for (int i = 0; i < characterCountArray.length; i++) {
            if (characterCountArray[i] > 0) {
                System.out.println("Character: " + (char) i + ", Count: " + characterCountArray[i]);
            }
        }
    }

    public static int[] countCharacters(String str) {
        // Assuming ASCII characters (0-127), you can adjust the size accordingly
        int[] characterCountArray = new int[128];

        // Convert the string to char array
        char[] charArray = str.toCharArray();

        // Iterate through each character and update the count
        for (char c : charArray) {
            // Increment the count for the corresponding character
            characterCountArray[c]++;
        }

        return characterCountArray;
    }
}
