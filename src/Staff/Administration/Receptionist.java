package Staff.Administration;

public class Receptionist extends Adminisration {

	public Receptionist(String name, int Id, int salaryLvl) {
		super(name, Id, salaryLvl);
		position = "Receptionist";
	}

	@Override
	public void doYourDuty() {
		System.out.println("Get calls from pets owners");
		
	}

}
