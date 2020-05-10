package Creator.Staff;

import java.util.ArrayList;

import Staff.Staff;
import Staff.Medical.Vet;

//import Staff.Medical.Vet;

public class VetCreator extends StaffCreator {

	@Override
	public Staff getStaffMember(ArrayList<String> ListOfNames) {
		Name = randomName.getName(ListOfNames);
		Id = randomId.getId();
		SalaryLvl = randomSalary.getSalary();

		return new Vet(Name, Id, SalaryLvl);

	}

}
