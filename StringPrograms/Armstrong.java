package StringPrograms;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();

        int temp1=num;
        int temp2=num;
        int count=0;
        double result=0;
        while(temp1!=0){
            temp1=temp1/10;
            count++;
        }
        while(temp2!=0){
            int rem=temp2%10;
            result=result+(Math.pow(rem, count));
            temp2=temp2/10;
        }

        if(result==num){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
