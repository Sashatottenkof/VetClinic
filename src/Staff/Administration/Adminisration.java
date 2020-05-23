package Staff.Administration;

import Staff.Staff;

public abstract class Adminisration extends Staff {

	public Adminisration(String name, int Id, int salaryLvl) {
		super(name, Id, salaryLvl);

	}

	/**
	 * Method that displays task performed by employee
	 */
	public abstract void doYourDuty();

}
