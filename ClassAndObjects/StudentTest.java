package ClassAndObjects;

import java.util.Scanner;

class Student{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }

    public float average(){
        return (float)total()/3;
    }
    public char grade(){
        if(average()>=60){
            return 'A';
        }
        else{
            return 'B';
        }
    }
    public String details(){
        return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students from the user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create an array to store the students
        Student[] students = new Student[numberOfStudents];

        // Input details for each student
        for (int i = 0; i < numberOfStudents; i++) {
            Student s = new Student();
            System.out.println("Enter details for student " + (i + 1) + ":");
            
            System.out.print("Roll: ");
            s.roll = scanner.nextInt();
            
            System.out.print("Name: ");
            s.name = scanner.next();
            
            System.out.print("Course: ");
            s.course = scanner.next();
            
            System.out.print("Marks (m1 m2 m3): ");
            s.m1 = scanner.nextInt();
            s.m2 = scanner.nextInt();
            s.m3 = scanner.nextInt();

            students[i] = s; // Add the student to the array
        }

        // Display details for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Details for student " + (i + 1) + ":");
            System.out.println("Total: " + students[i].total());
            System.out.println("Average: " + students[i].average());
            System.out.println("Grade: " + students[i].grade());
            System.out.println("Details: " + students[i].details());
            System.out.println(); // Add a newline for better readability
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}