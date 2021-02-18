 class Specialist extends Doctor {
	   
	 protected String speciality;
	 
	 Specialist() {
	 }
	 
	 Specialist(final String str, final int num, final String addr ,final String special)//invoke base class constructor// 
	 {
		 speciality = special;
		 
	 }

	 void display() {
		 super.display(); //call base class method
		 System.out.println("The speciality is :" +speciality);
	 }
}
class NonSpecialist extends Doctor
{
	NonSpecialist() {
	}
	
	NonSpecialist(final String str, final int num, final String addr )
	{
		
		super(str, num, addr);
	}
	
}
