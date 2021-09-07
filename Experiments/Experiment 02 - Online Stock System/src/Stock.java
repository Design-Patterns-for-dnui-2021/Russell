import java.util.ArrayList;

public class Stock implements Subject {
	private ArrayList<StockHolder> stockHolders = new ArrayList<StockHolder>();
	private double price = 100;
	private String name = "";
	
	Stock(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void registerHolder(StockHolder holder) {
		stockHolders.add(holder);
	}
	
	@Override
	public void removeHolder(StockHolder holder) {
		stockHolders.remove(holder);
	}
	
	@Override
	public void notifyHolders() {
		for (var holder : stockHolders) {
			holder.update(name, price);
		}
	}
	
	public void updatePrice(int price) {
		double prev = this.price;
		this.price = price;	
		double percent = Math.abs((price - prev) / prev) * 100;
		if (percent > 5) notifyHolders();
	}
}
