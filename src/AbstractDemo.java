abstract class Animal1 
{
	abstract void makeSound();
	
	public void eat() {
		System.out.println("i can eat");
	}
}
class Dog1 extends Animal1
{
	
	//provide implementation of abstract method
	public void makeSound()
	{
		System.out.println("bark bark");
	}
}

class AbstractDemo
{

	public static void main(String[] args) {

		Dog1 d1 = new Dog1();
		d1.makeSound();
		d1.eat();
	}

}
