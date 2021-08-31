import aircrafts.Aircraft;
import aircrafts.Airplane;
import aircrafts.Fighter;
import aircrafts.Harrier;
import aircrafts.Helicopter;
import flight.SubSonicFly;
import flight.SuperSonicFly;
import takeoff.LongDistanceTakeOff;
import takeoff.VerticalTakeOff;

public class Main {

	public static void main(String[] args) {
		
		// using Helicopter with VerticalTakeOff & SubSonicFly
		Aircraft aircraft = new Helicopter();
		aircraft.setTakeOff(new VerticalTakeOff());
		aircraft.setFlight(new SubSonicFly());
		aircraft.displayInfo();
		
		// using Airplane with LongDistanceTakeOff & SubSonicFly
		aircraft = new Airplane();
		aircraft.setTakeOff(new LongDistanceTakeOff());
		aircraft.setFlight(new SubSonicFly());
		aircraft.displayInfo();
		
		// using Fighter with LongDistanceTakeOff & SuperSonicFly
		aircraft = new Fighter();
		aircraft.setTakeOff(new LongDistanceTakeOff());
		aircraft.setFlight(new SuperSonicFly());
		aircraft.displayInfo();
		
		// using Harrier with VerticalTakeOff & SuperSonicFly
		aircraft = new Harrier();
		aircraft.setTakeOff(new VerticalTakeOff());
		aircraft.setFlight(new SuperSonicFly());
		aircraft.displayInfo();
	}

}
