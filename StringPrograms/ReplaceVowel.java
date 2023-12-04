package StringPrograms;

import java.util.Scanner;

public class ReplaceVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        char[] charArr = str.toLowerCase().toCharArray();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < str.length(); i++) {
            for (char vowel : vowels) {
                if (charArr[i] == vowel) {
                    charArr[i] = '*';
                    break;
                }
            }
        }
        String result = new String(charArr);
        System.out.println("Original String: " + str);
        System.out.println("Result after replacing vowels with '*': " + result);
    }
}
