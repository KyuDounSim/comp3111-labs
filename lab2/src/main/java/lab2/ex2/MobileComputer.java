package lab2.ex2;

public class MobileComputer extends Computer implements Chargeable {
	private int battery;
	public MobileComputer() {
		secret = "MobileComputer Secret";
		battery = 5;
	}
	@Override
	public void work() {
		if (battery > 0) {
			System.out.println("It is working on my lap.");
			battery--;
		} else 
			System.out.println("Running out of battery");
	}
	
	// Because mobileComputer was not chargeable, in other words Mobile Computer was not specified that it would be chargeable
	// We have to let know the JVM that it would be "Chargeable"
	// Only pure virtual function, therefore we should let know that Mobile computer will has its own charge()
	public void charge() {
		if (battery < 10)
			battery++;
	}
}
