package Creator.Staff;

import java.util.ArrayList;

import Staff.Staff;
import Staff.Administration.Receptionist;

public class ReceptionistCreator extends StaffCreator {

	public ArrayList<Receptionist> receptionists = new ArrayList<Receptionist>();

	@Override
	public Staff getStaffMember(ArrayList<String> ListOfNames) {
		Name = randomName.getName(ListOfNames);
		Id = randomId.getId();
		SalaryLvl = randomSalary.getSalary();

		return new Receptionist(Name, Id, SalaryLvl);

	}

}
