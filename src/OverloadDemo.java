
public class OverloadDemo{
	
	void createContact(String n,long ph)
	  {
		  System.out.println("name:" +n+ " "+"phone:"+ph);
	  }
	  void createContact(String n,long ph1,long ph2)
	  {
		  System.out.println("name:"+n+ ""+"phone:"+ph1+","+ph2);
	  }
	public static void main(String[] args)
	{
		
         OverloadDemo p1=new OverloadDemo();
           p1.createContact("nikki",100000007);
           p1.createContact("pinky",995938724,87678876);
	}

}
