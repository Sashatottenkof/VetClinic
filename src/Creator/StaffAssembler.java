package Creator;

import java.io.IOException;
import java.util.ArrayList;

import Creator.Staff.NurseCreator;
import Creator.Staff.ReceptionistCreator;
import Creator.Staff.SysadminCreator;
import Creator.Staff.TraineeCreator;
import Creator.Staff.VetCreator;

import ReadFromFile.ReadStaff;
import Staff.Staff;
import Staff.Administration.Receptionist;
import Staff.Administration.Sysadmin;
import Staff.Medical.Nurse;
import Staff.Medical.Trainee;
import Staff.Medical.Vet;

public class StaffAssembler {

	private int NumberOfSysadmins = 5;
	private int NumberOfReceptionists = 5;
	private int NumberOfNurses = 15;
	private int NumberOfVets = 5;
	private int NumberOfTrainees = 10;

	SysadminCreator newSysadmin = new SysadminCreator();
	ReceptionistCreator newReceptionist = new ReceptionistCreator();
	NurseCreator newNurse = new NurseCreator();
	VetCreator newVet = new VetCreator();
	TraineeCreator newTrainee = new TraineeCreator();

	ArrayList<String> ListOfNames = new ArrayList<String>();
	ReadStaff read = new ReadStaff();

	ArrayList<Sysadmin> sysadminsList = new ArrayList<Sysadmin>();
	ArrayList<Receptionist> receptionistList = new ArrayList<Receptionist>();
	ArrayList<Nurse> nursesstList = new ArrayList<Nurse>();
	ArrayList<Vet> vetsList = new ArrayList<Vet>();
	ArrayList<Trainee> traineesList = new ArrayList<Trainee>();

	ArrayList<Staff> allStaff = new ArrayList<Staff>();

	/**
	 * In the constructor we call a method that calls a BufferReader so we don't
	 * need to read a text file every time we instantiate a new staff member
	 * 
	 */
	public StaffAssembler() {
		ReadStaffNames();
		getSysadminList();
		getReceptionList();
		getNurseList();
		getVetList();
		getTraineeList();
		getListOfStaff();
	}

	public void ReadStaffNames() {

		try {
			ListOfNames = read.getNameList();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void getSysadminList() {
		for (int i = 0; i < NumberOfSysadmins; i++) {
			sysadminsList.add((Sysadmin) newSysadmin.getStaffMember(ListOfNames));
		}

	}

	public void getReceptionList() {
		for (int i = 0; i < NumberOfReceptionists; i++) {
			receptionistList.add((Receptionist) newReceptionist.getStaffMember(ListOfNames));
		}

	}

	public void getNurseList() {
		for (int i = 0; i < NumberOfNurses; i++) {
			nursesstList.add((Nurse) newNurse.getStaffMember(ListOfNames));
		}

	}

	public void getVetList() {
		for (int i = 0; i < NumberOfVets; i++) {
			vetsList.add((Vet) newVet.getStaffMember(ListOfNames));
		}

	}

	public void getTraineeList() {
		for (int i = 0; i < NumberOfTrainees; i++) {
			traineesList.add((Trainee) newTrainee.getStaffMember(ListOfNames));
		}

	}

	public void getListOfStaff() {
		allStaff.addAll(sysadminsList);
		allStaff.addAll(receptionistList);
		allStaff.addAll(vetsList);
		allStaff.addAll(nursesstList);
		allStaff.addAll(traineesList);
	}

	public void showAllStaff() {
		for (Staff v : allStaff) {
			System.out.println(v.toString());

		}
	}

	public void showSysadmins() {
		for (Staff v : sysadminsList) {
			System.out.println(v.toString());

		}
	}

	public void showReceptionists() {
		for (Staff v : receptionistList) {
			System.out.println(v.toString());

		}
	}

	public void showNurses() {
		for (Staff v : nursesstList) {
			System.out.println(v.toString());

		}
	}

	public void showVets() {
		for (Staff v : vetsList) {
			System.out.println(v.toString());

		}
	}

	public void showTrainees() {
		for (Staff v : traineesList) {
			System.out.println(v.toString());

		}
	}

	public ArrayList<Staff> getAllStaff() {
		return allStaff;
	}

	/**We will use it to search for a specific employee
	 * @param allStaff
	 */
	public void setAllStaff(ArrayList<Staff> allStaff) {
		this.allStaff = allStaff;
	}

	/**We will use it to assign animals to each of those vets
	 * @return
	 */
	public ArrayList<Vet> getVetsList() {
		return vetsList;
	}

	public void setVetsList(ArrayList<Vet> vetsList) {
		this.vetsList = vetsList;
	}

}
