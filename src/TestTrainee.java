import java.util.Scanner;

class Trainee //class declaration//
{
	int tId;    //define properties//
	String tName;
	String technology;
	float salary,stipend;
	
	//define methods//
	void input()
	{ 
		Scanner s = new Scanner(System.in);
		System.out.println("enter Id,Name,Technology &salary");
		tId = s.nextInt();
		tName = s.next();
		technology = s.next();
		salary = s.nextFloat();
	}
	
	float calculate()
	{
		stipend = salary - 200;
		return stipend;      //return value to main//
	}
	
	void display()
	{
		System.out.println("******Trainee details*******");
		System.out.println("trainee id:" +tId);
		System.out.println("trainee name:" +tName);
		System.out.println("technology:" +technology);
		System.out.println("salary" +salary);
		
	}
}
public class TestTrainee {  //main class//

	public static void main(String[] args)
	{
		Trainee t1 = new Trainee(); //creating  object of trainee class//
		Trainee t2 = new Trainee();	
		
		t1.input();      //method call//  
		t1.display();
		
		float s1 = t1.calculate();
		float s2 = t2.calculate();
 
		t1.input();
		System.out.println("stipend   :"+s1);
		t2.display();
		System.out.println("stipend   :"+s2);
		
		
	}

}
