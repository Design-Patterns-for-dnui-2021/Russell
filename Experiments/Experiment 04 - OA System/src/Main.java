
public class Main {
	public static void main(String[] args) {
		// level 1: admin
		// level 2: staff
		User adminUser = new User("Russell Raimundo", 127321, 1);
		User staffUser = new User("Novel Pretty", 319823, 2);
		
		Permission perm;
		PermissionFactory factory = new OAPermissionFactory();
		
		perm = adminUser.login(factory);
		perm.operatePermission();
		perm.authority();
		
		System.out.println("----------------------------------------");
		
		perm = staffUser.login(factory);
		perm.operatePermission();
		perm.authority();
	}
}
