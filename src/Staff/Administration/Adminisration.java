package Staff.Administration;

import Staff.Staff;

public abstract class Adminisration extends Staff {
	
	// All Admin staff performs a certain task
	String Task;

	public Adminisration(String name, int Id, int salaryLvl) {
		super(name, Id, salaryLvl);

	}

	public String getTask() {
		return Task;
	}

	public void setTask(String activitie) {
		Task = activitie;
	}
}