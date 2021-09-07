package aircrafts;

public class Harrier extends Aircraft {
	@Override
	public void displayInfo() {
		System.out.println("Currently using Harrier as the Aircraft");
		System.out.println("------------------------------------------");
		this.performTakeOff();
		this.performFlight();
		System.out.print("\n");
	}
}
