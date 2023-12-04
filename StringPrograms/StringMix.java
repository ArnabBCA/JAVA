package StringPrograms;

import java.util.Scanner;

public class StringMix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String 1:");
        String str1=sc.nextLine();
        char[] string1=str1.toCharArray();
        System.out.println("Enter a String 2:");
        String str2=sc.nextLine();
        char[] string2=str2.toCharArray();

        StringBuilder result = new StringBuilder();
        for(int i=0; i < Math.min(string1.length, string2.length); i++){
            result.append(string1[i]).append(string2[i]);
        }
        if (string1.length > string2.length) {
            result.append(str1.substring(string2.length));
        } else if (string2.length > string1.length) {
            result.append(str2.substring(string1.length));
        }

        System.out.println("Mixed String: " + result.toString());
    }
}
