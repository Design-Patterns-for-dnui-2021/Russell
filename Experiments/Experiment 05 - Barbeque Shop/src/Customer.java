
public class Customer {
	private Waiter waiter;
	
	public void callWaiter(Waiter waiter) {
		this.waiter = waiter;
	}
	
	public void orderMuttonString() {
		System.out.println("Customer is ordering mutton string...");
		this.waiter.takeOrder("mutton");
	}
	
	public void orderOneChicken() {
		System.out.println("Customer is ordering one chicken...");
		this.waiter.takeOrder("chicken");
	}
}
