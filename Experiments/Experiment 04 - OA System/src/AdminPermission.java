
public class AdminPermission implements Permission {

	@Override
	public void operatePermission() {
		System.out.println("Admin Permission: Can control and manipulate all features");
	}

	@Override
	public void authority() {
		System.out.println("Admin Authority: Make sure all data in the system is valid and prevent fraud");
	}

}
