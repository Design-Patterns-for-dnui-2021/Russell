
public class User {
	private String name;
	private int accountNo;
	private int level;
	
	User(String name, int accountNo, int level) {
		this.name = name;
		this.accountNo = accountNo;
		this.level = level;
	}
	
	Permission login(PermissionFactory factory) {
		System.out.println("Logged in as: " + name);
		System.out.println("Account No: " + accountNo);
		System.out.println("Permission Level: " + level);
		return factory.getPermission(level);
	}
	
	int getLevel() {
		return this.level;
	}
}
