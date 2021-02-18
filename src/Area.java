import java.util.Scanner;
public class Area {

	int length,breadth;
	float area;
Area(){
}
   void input()
   {
	 Scanner  s =new Scanner(System.in);
	   System.out.println("enter the value of length and breadth");
	   length = s.nextInt();
	   breadth =s. nextInt();
   }
   void returnArea()
   {
	   area = length*breadth;
	   System.out.println("Area:"+area);
   }
}
	


