class Student200
{
    private int rollno;
    private String name;
    static String college="CMR";
    
    static void changeCollege()
    {
        college="MLR";
    }
    public Student200(int r,String n)
    {
        rollno=r;
        name=n;
    }
    public void display()
    {
        System.out.println(rollno+" "+name+" "+college);
    }
    
}
public class TestStaticMethod {

 

    public static void main(String[] args) {
    
        Student200.changeCollege();//call static method without creating object
        
        Student200 s1=new Student200(101,"Robert");
        Student200 s2=new Student200(102,"John");
        Student200 s3=new Student200(103,"Sam");
        
        s1.display();
        s2.display();
        s3.display();
    }

 

}
 