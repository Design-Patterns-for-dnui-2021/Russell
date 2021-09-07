
public class Main {

	public static void main(String[] args) {
		
		StockHolder russell = new Russell();
		StockHolder david = new David(); 
		
		Stock bbca = new Stock("BBCA", 100);
		bbca.registerHolder(russell);
		bbca.registerHolder(david);
		
		Stock unlv = new Stock("UNLV", 100);
		unlv.registerHolder(russell);
		
		bbca.updatePrice(98);
		bbca.updatePrice(92);
		unlv.updatePrice(190);
	}

}
