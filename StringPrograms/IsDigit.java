package StringPrograms;

import java.util.Scanner;

public class IsDigit {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        
        boolean containsNumber = hasNumber(str);
        if (containsNumber) {
            System.out.println("The string contains a number.");
        } else {
            System.out.println("The string does not contain a number.");
        }

    }
    public static boolean hasNumber(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
