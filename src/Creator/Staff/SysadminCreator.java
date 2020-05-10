package Creator.Staff;

import java.util.ArrayList;

import Staff.Staff;
import Staff.Administration.Sysadmin;

public class SysadminCreator extends StaffCreator {


	@Override
	public Staff getStaffMember(ArrayList<String> allNames) {
		Name = randomName.getName(allNames);
		Id = randomId.getId();
		SalaryLvl = randomSalary.getSalary();

		return new Sysadmin(Name, Id, SalaryLvl);
		 
	}

}
