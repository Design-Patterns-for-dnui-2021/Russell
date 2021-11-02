
public class TV extends Device {
	private String brand;
	
	public TV(String brand, int volt) {
		this.brand = brand;
		this.volt = volt;
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV: " + this.brand + " Turned ON");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV: " + this.brand + " Turned OFF");
	}
}
