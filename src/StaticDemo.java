
public class StaticDemo {
	 static int count;
	//  int count;
	 StaticDemo()
	 {
		 count = count + 1;
	 }
	 static void display()
	 {
		 System.out.println("The No. of Objects created is:" +count);
		 
	 }

	public static void main(String[] args) {
		
	    StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
     	StaticDemo s3 = new StaticDemo();
	StaticDemo.display();//method calling by static variable//
	//s3.display();//calling method by object created//
     	//display(); //without creating object method calling//
	}

}
