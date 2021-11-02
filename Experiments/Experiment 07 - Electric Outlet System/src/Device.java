
public abstract class Device {
	protected int volt;
	
	public abstract void turnOn();
	public abstract void turnOff();
	
	public void setVolt(int volt) {
		this.volt = volt;
	}
	
	public int getVolt() {
		return volt;
	}
}
