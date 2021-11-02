
public class ThreePhaseAdapter implements Socket {
	private Device device;
	
	public ThreePhaseAdapter(Device device) {
		this.device = device;
	}
	
	@Override
	public void plug() {
		int volt = device.getVolt();
		if (volt > 150) {
			System.out.println("Adapting the high voltage to lower...");
			device.setVolt(volt - 50);
		} else if (volt < 150) {
			System.out.println("Adapting the low voltage to higher...");
			device.setVolt(volt + 50);
		}
		device.turnOn();
	}

}
