package Creator.Staff;

import java.util.ArrayList;

import Staff.Staff;
import Staff.Medical.Nurse;

public class NurseCreator extends StaffCreator {

	public ArrayList<Nurse> nurses = new ArrayList<Nurse>();

	@Override
	public Staff getStaffMember(ArrayList<String> ListOfNames) {
		Name = randomName.getName(ListOfNames);
		Id = randomId.getId();
		SalaryLvl = randomSalary.getSalary();

		return new Nurse(Name, Id, SalaryLvl);

	}

}
