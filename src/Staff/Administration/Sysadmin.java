package Staff.Administration;

public class Sysadmin extends Adminisration{

	public Sysadmin(String name, int Id, int salaryLvl) {
		super(name, Id, salaryLvl);
		position = "System Administrator";
	}

	@Override
	public void doYourDuty() {
		System.out.println("Plays video games");
		
	}

}
