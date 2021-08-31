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
		Helicopter helicopter = new Helicopter();
		helicopter.setTakeOff(new VerticalTakeOff());
		helicopter.setFlight(new SubSonicFly());
		helicopter.displayInfo();
		
		// using Airplane with LongDistanceTakeOff & SubSonicFly
		Airplane airplane = new Airplane();
		airplane.setTakeOff(new LongDistanceTakeOff());
		airplane.setFlight(new SubSonicFly());
		airplane.displayInfo();
		
		// using Fighter with LongDistanceTakeOff & SuperSonicFly
		Fighter fighter = new Fighter();
		fighter.setTakeOff(new LongDistanceTakeOff());
		fighter.setFlight(new SuperSonicFly());
		fighter.displayInfo();
		
		// using Harrier with VerticalTakeOff & SuperSonicFly
		Harrier harrier = new Harrier();
		harrier.setTakeOff(new VerticalTakeOff());
		harrier.setFlight(new SuperSonicFly());
		harrier.displayInfo();
	}

}
