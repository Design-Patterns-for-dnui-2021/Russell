package aircrafts;

public class Helicopter extends Aircraft {
	@Override
	public void displayInfo() {
		System.out.println("Currently using Helicopter as the Aircraft");
		System.out.println("------------------------------------------");
		this.performTakeOff();
		this.performFlight();
		System.out.print("\n");
	}
}
