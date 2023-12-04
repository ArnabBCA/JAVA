package StringPrograms;

import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;

        char[] arr = {'@', '#', '$', '?', '&', '*'};
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (contains(arr, c)) {
                hasSpecialChar = true;
            }
        }

        if (str.length() < 6 || str.length() > 18) {
            System.err.println("String length must be between 6 and 18 ");
        } else if (!hasUpperCase || !hasLowerCase) {
            System.err.println("String must contain at least 1 uppercase and 1 lowercase letter ");
        } else if (!hasSpecialChar) {
            System.err.println("String must contain at least 1 special Character {'@','#','$','?','&','*'}");
        } else {
            System.err.println("String Accepted!!");
        }
    }

    public static boolean contains(char[] arr, char c) {
        for (char x : arr) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }
}
