package com.valuemomentum.training.collection;


import java.util.Comparator;



public class Student55 {
        int rollno;
        String name,address;
        
        public Student55(int rollno, String name, String address) {
            super();
            this.rollno = rollno;
            this.name = name;
            this.address = address;
        }
// used to print student properties in main when obj is given in sop
        @Override
        public String toString() {
            return "Student2 [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
        }        
}
class SortByRoll implements Comparator<Student55>
{

 

    @Override
    public int compare(Student55 s1, Student55 s2) {
        // TODO Auto-generated method stub
        return s1.rollno-s2.rollno;
    }
    
}
class SortByName implements Comparator<Student55>
{

 

    @Override
    public int compare(Student55 s1, Student55 s2) {
        // TODO Auto-generated method stub
        return 0;
    }
}