class Animal{
	String name ;
	public void eat() {
		System.out.println("I can eat");
	}
}
	class Dog extends Animal //inherit from animal//
	{
		
		//new method in subclass//
		public void display()
		{
			System.out.println("my name is"+name);
			
		}
	}
	
public class AnimalTest {

	public static void main(String[] args) {
		
		//create an object of the subclass
		Dog labrador = new Dog();
		
		//acess field of superclass
		labrador.name = "  rohu";
	//	System.out.println("break point");
		labrador.display();
		labrador.eat();
	}

}
