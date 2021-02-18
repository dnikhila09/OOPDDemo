import java.util.Scanner;
public class Employee6 {
	 String name;
	 float salary;
	 int workingHours;
	 
	 Employee6(String n, float sal, int wh)
	 {
		 name= n;
		 salary = sal;
		 workingHours = wh;
	 }
	 void input()
	 {
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter salary and  working hours");
		 salary =s.nextInt();
		 workingHours = s.nextInt();
	 }
	 void getInfo()
	 {
		 if(salary < 500)
		 {
           salary = salary + 10;
		 }
	
	 }
		 void AddWork()
		 {
			 if(workingHours>6)
			 {
				 salary = salary + 5;
			 }
		 }
		 void display() {
			 System.out.println("The final salary is"+salary);
		 }
		 
		 
}
