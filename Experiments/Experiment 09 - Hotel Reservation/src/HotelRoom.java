
public class HotelRoom {
	private RoomState state;
	
	public HotelRoom() {
		this.state = new RoomAvailable();
	}
	
	public void showInfo() {
		this.state.roomInfo();
	}
	
	public void changeState(RoomState state) {
		this.state = state;
	}
}
