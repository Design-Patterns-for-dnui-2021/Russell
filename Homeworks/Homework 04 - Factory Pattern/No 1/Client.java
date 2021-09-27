
public class Client {

	public static void main(String[] args) {		
		TVFactory factory = new TVFactory();
		
		// constructing haier tv
		TV haier = factory.produce("Haier");
		haier.play();
		
		// constructing hisense tv
		TV hisense = factory.produce("Hisense");
		hisense.play();
	}

}
