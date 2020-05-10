package Creator.Staff;

import java.util.ArrayList;

import Creator.Staff.Generator.StaffNameGen;
import Creator.Staff.Generator.StaffSalaryGen;
import Staff.Staff;
import Creator.Staff.Generator.IDStaffGen;

public abstract class StaffCreator {

	protected String Name;
	protected int Id;
	protected int SalaryLvl;

	StaffNameGen randomName = new StaffNameGen();
	StaffSalaryGen randomSalary = new StaffSalaryGen();
	IDStaffGen randomId = new IDStaffGen();

	public abstract Staff getStaffMember(ArrayList<String> ListOfNames);

}
