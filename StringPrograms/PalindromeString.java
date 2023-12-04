package StringPrograms;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();

        char arr[]=new char[str.length()];
        //char[] arr=str.toCharArray();
        int b=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=str.charAt(b);
            b--;
        }
        String reversedString = new String(arr);

        /*StringBuilder reversedStringBuilder = new StringBuilder(str).reverse();            //using StringBuilder
        String reversedString = reversedStringBuilder.toString();*/
        
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedString);
    }
}
