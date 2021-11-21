
public class Main {

	public static void main(String[] args) {
		// the default state will be available, set in constructor
		HotelRoom hotel = new HotelRoom();
		hotel.showInfo();
		
		// change the room state to reserved
		hotel.changeState(new RoomReserved());
		hotel.showInfo();
		
		// change the room state to occupied
		hotel.changeState(new RoomOccupied());
		hotel.showInfo();
		
		// change it back to available
		hotel.changeState(new RoomAvailable());
		hotel.showInfo();
	}

}
