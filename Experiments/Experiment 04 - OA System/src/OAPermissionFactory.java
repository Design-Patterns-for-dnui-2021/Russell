
public class OAPermissionFactory implements PermissionFactory {

	@Override
	public Permission getPermission(int level) {
		switch (level) {
			case 1:
				return new AdminPermission();
			case 2:
				return new StaffPermission();
			default: 
				throw new Error("Invalid permission level");
		}
	}
	
}
