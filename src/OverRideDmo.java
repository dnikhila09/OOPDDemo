class Bank{
	int getRateOfInterest() { return 0;}
}
//creating child classes
class SBI extends Bank{
	int getRateOfInterest() { return 8;}
}

class ICICI extends Bank{
	int getRateOfInterest() { return 7;}

}

class AXIS extends Bank{
	int getRateOfInterest() { return 9;}
	}

public class OverRideDmo {

	public static void main(String[] args) {
		  SBI s = new SBI();
		  ICICI i = new ICICI();
          AXIS a = new AXIS();
          System.out.println("SBI rate of intrst:" +s.getRateOfInterest());
          System.out.println("ICICI rate of intrst:" +i.getRateOfInterest());
          System.out.println("AXIS rate of intrst:" +a.getRateOfInterest());
}
}