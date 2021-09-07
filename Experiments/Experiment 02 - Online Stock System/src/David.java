
public class David implements StockHolder {

	@Override
	public void update(String name, double price) {
		System.out.println("Hi David,");
		System.out.println("Stock named " + name + " is fluctuated more than 5% resulting in price " + price);
	}

}
