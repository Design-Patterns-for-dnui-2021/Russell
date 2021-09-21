
public class StaffPermission implements Permission {

	@Override
	public void operatePermission() {
		System.out.println("Staff Permission: Can only see and control limited features");
	}

	@Override
	public void authority() {
		System.out.println("Staff Authority: Manage and control limited data in the system");
	}

}

