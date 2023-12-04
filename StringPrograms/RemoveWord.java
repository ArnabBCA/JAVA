package StringPrograms;

import java.util.Scanner;

public class RemoveWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");

        String del = "Ghosh";
        String result = "";
        String str = sc.nextLine();
        String[] arrOfStr = str.split(" ");

        for (String s : arrOfStr) {
            if (!s.equals(del)) {
                result = result.concat(s + " ");
            }
        }
        System.out.println(result.trim());
    }
}
