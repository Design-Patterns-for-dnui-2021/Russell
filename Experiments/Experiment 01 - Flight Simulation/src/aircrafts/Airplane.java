package aircrafts;

public class Airplane extends Aircraft {
	@Override
	public void displayInfo() {
		System.out.println("Currently using Airplane as the Aircraft");
		System.out.println("------------------------------------------");
		this.performTakeOff();
		this.performFlight();
		System.out.print("\n");
	}
}
