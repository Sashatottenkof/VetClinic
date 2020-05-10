package Creator.Staff;

import java.util.ArrayList;

import Staff.Staff;
import Staff.Medical.Trainee;

public class TraineeCreator extends StaffCreator {

	@Override
	public Staff getStaffMember(ArrayList<String> ListOfNames) {

		Name = randomName.getName(ListOfNames);
		Id = randomId.getId();
		SalaryLvl = randomSalary.getSalary();

		return new Trainee(Name, Id, SalaryLvl);
	}

}
