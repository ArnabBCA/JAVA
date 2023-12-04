package StringPrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int temp1=num;
        int reverse=0;

        while(temp1!=0){
            int rem=temp1%10;
            reverse=reverse*10+rem;
            temp1=temp1/10;
        }
        if(num == reverse)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a palindrome number");
        }
    }
}
