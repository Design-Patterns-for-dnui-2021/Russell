
public class Person extends Subject implements Observer, Member {
	private String name;
	
	Person(String name) {
		this.name = name;
	}

	@Override
	public void action() {
		System.out.println(this.name + " take action because other member got attacked!");
	}

	@Override
	public void update() {
		this.action();
	}
	
	public void beat() {
		System.out.println(this.name + " got attacked");
		this.notifyObservers();
		System.out.println("");
	}
	
}
