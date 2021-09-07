package aircrafts;
import flight.FlightType;
import takeoff.TakeOffType;

public class Aircraft {
	private TakeOffType takeoff;
	private FlightType flight;
	
	public void setTakeOff(TakeOffType takeoff) {
		this.takeoff = takeoff;
	}
	
	public void setFlight(FlightType flight) {
		this.flight = flight;
	}
	
	public void performTakeOff() {
		this.takeoff.performTakeOff();
	}
	
	public void performFlight() {
		this.flight.performFlight();
	}
	
	public void displayInfo() {
		System.out.println("No particular Aircraft has selected!");
	}
	
}
