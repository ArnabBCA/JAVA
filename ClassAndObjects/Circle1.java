package ClassAndObjects;

import java.util.Scanner;
class Circle {
    public double radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

public class Circle1 {
    public static void main(String[] args){
        Circle c1=new Circle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius");;
        c1.radius=sc.nextInt();
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
    }
}