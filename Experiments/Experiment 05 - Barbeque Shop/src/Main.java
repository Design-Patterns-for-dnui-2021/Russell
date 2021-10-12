
public class Main {

	public static void main(String[] args) {
		// every waiters have the same chef
		
		// customer calling waiter one and orders mutton string
		Customer russell = new Customer();
		russell.callWaiter(new WaiterOne(new Chef()));
		russell.orderMuttonString();
		
		// customer calling waiter two and orders one chicken
		russell.callWaiter(new WaiterTwo(new Chef()));
		russell.orderOneChicken();
	}

}
