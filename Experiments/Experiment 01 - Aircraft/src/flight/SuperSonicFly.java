package flight;

public class SuperSonicFly implements FlightType {

	@Override
	public void performFlight() {
		System.out.println("Performing Super Sonic Flight... Whooshh!");
	}

}
