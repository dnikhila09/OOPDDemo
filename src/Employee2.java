
public class Employee2 {
 String name;
 int yearOfJoining;
 float salary;
 String address;
 
      Employee2(String n, int yoj,String addr)
       {
     	 name = n;
     	 yearOfJoining = yoj;
     	// salary = sal;
     	 address = addr;
       }
      public void display()
      {
    	  
    	  System.out.println("");
    	  System.out.println(""+name   +yearOfJoining  +address);
    //	  System.out.println("\t"+salary);
    	  
    	  
    	  
      }
 }

