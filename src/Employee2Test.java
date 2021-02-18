
public class Employee2Test {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2("Robert\t\t",   1994,"\t\t64C - WallsStreet");
		Employee2 e2 = new Employee2("Sam\t\t",   2000,"\t\t28D - WallsStreet");
		Employee2 e3 = new Employee2("John\t\t",   1999,"\t\t26B - WallsStreet");
		
		System.out.println("Name \t year of joining \t Address   ");
		e1.display();
		e2.display();
		e3.display();
	}

}
