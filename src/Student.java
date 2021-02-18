import java.util.Scanner;
public class Student {
    private int rollno,marks;
    private String name,course;
    Scanner s;
   
    Student(int a,String b,String c,int d)
    {
        rollno=a;
        name=b;
        course=c;
        marks=d;
        s=new Scanner(System.in);
    }
   
    public void print()
    {
        System.out.println("STUDENT DETAILS:");
        System.out.println();
        System.out.println("Rollno: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Course: "+course);
        System.out.println("Marks: "+marks);
        System.out.println();
    }
}