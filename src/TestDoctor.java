class TestDoctor { // create a main class
	
	public static void main(String[] args) {
		Specialist spObj = new Specialist("Mary",1234,"new york","medicine");
		spObj.display();
		NonSpecialist nonSpObj = new NonSpecialist("john",3455,"sydney");
		nonSpObj.display();
		
				}
}