
public class Test {

	public static void main(String[] args) {
		Person player1 = new Person("Russell");
		Person player2 = new Person("David");
		Person player3 = new Person("Juvina");
		
		// cross register player1, player2, and player3 to form one team
		
		// register player2 and player3 as the member of player1's team
		player1.registerObserver(player2);
		player1.registerObserver(player3);		
		
		// register player1 and player3 as the member of player2's team
		player2.registerObserver(player1);
		player2.registerObserver(player3);
		
		// register player1 and player2 as the member of player3's team
		player3.registerObserver(player1);
		player3.registerObserver(player2); 
		
		// whenever a player got attacked
		player1.beat();
		player2.beat();
		player3.beat();
	}

}
