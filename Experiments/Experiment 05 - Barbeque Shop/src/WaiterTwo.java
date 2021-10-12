
public class WaiterTwo implements Waiter {
	private Chef chef;
	
	public WaiterTwo(Chef chef) {
		this.chef = chef;
	}
	
	@Override
	public void takeOrder(String menu) {
		if (menu == "mutton") this.chef.cookMuttonString();
		else if (menu == "chicken") this.chef.cookOneChicken();
		else throw new Error("Menu doesn't exist");
	}
}
