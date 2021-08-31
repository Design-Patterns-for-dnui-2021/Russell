package aircrafts;

public class Fighter extends Aircraft {
	@Override
	public void displayInfo() {
		System.out.println("Currently using Fighter as the Aircraft");
		System.out.println("------------------------------------------");
		this.performTakeOff();
		this.performFlight();
		System.out.print("\n");
	}
}
