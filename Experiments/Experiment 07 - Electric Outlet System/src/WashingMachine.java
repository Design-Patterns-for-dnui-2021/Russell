
public class WashingMachine extends Device {
	private String brand;
	
	public WashingMachine(String brand, int volt) {
		this.brand = brand;
		this.volt = volt;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Washing Machine: " + this.brand + " Turned ON");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Washing Machine: " + this.brand + " Turned OFF");
	}
}
