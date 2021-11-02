
public class Main {

	public static void main(String[] args) {
		Device tv = new TV("LG", 200);
		Device washMachine = new WashingMachine("Samsung", 150);
		
		// the adapter adjusting the volt suitable for the device
		Socket socket = new ThreePhaseAdapter(tv);
		socket.plug();
		
		System.out.println("---------------------------");
		
		// if the volt is correct is doesn't adjust anything
		socket = new ThreePhaseAdapter(washMachine);
		socket.plug();
	}

}
