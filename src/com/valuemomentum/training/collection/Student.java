package com.valuemomentum.training.collection;
import java.util.Comparator;
public class Student  {
    private String studentname;
    private int rollno;
    private int marks;
    private String course;

    public Student(int marks, String studentname, int rollno, String course) {
        this.marks = marks;
        this.studentname = studentname;
        this.rollno = rollno;
        this.course= course;
    }

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
		   String StudentName1 = s1.getStudentname().toUpperCase();
		   String StudentName2 = s2.getStudentname().toUpperCase();

		   //ascending order
		   return StudentName1.compareTo(StudentName2);

		   //descending order
		   //return StudentName2.compareTo(StudentName1);
	    }};
	
	    public static Comparator<Student> StuMarkscomparator = new Comparator<Student>() {

	    	public int compare(Student s1, Student s2) {

	    	   int marks1 = s1.getMarks();
	    	   int marks2 = s2.getMarks();

	    	   /*For ascending order*/
	    	   return marks1-marks2;

	    	   /*For descending order*/
	    	   //rollno2-rollno1;
	       }};
	       
	       @Override
	       public String toString() {
	    	   return ( this.marks+""+this.studentname+""+this.rollno+""+this.course+"");
	       }
	       
}
	       
	       