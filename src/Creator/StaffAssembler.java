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
		
	//this class is used to create all staff for the Clinic

public class StaffAssembler {
	

	private final int NumberOfSysadmins = 5;
	private final int NumberOfReceptionists = 5;
	private final int NumberOfNurses = 15;
	private final int NumberOfVets = 5;
	private final int NumberOfTrainees = 10;

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
		createSysadminList();
		createReceptionList();
		createNurseList();
		createVetList();
		createTraineeList();
		createListOfStaff();
	}

	/**
	 * Reads the file with names
	 */
	public void ReadStaffNames() {

		try {
			ListOfNames = read.getNameList();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	/**
	 *  The method creates Array list of Sysadmins by calling "getStaffMember" method
	 *  as many times as we need Sysadmins
	 */
	public void createSysadminList() {
		for (int i = 0; i < NumberOfSysadmins; i++) {
			sysadminsList.add((Sysadmin) newSysadmin.getStaffMember(ListOfNames));
		}

	}

	/**
	 *   The method creates Array list of Receptionists by calling "getStaffMember" method
	 *  as many times as we need Receptionists
	 */
	public void createReceptionList() {
		for (int i = 0; i < NumberOfReceptionists; i++) {
			receptionistList.add((Receptionist) newReceptionist.getStaffMember(ListOfNames));
		}

	}

	/**
	 * The method creates Array list of Nurses by calling "getStaffMember" method
	 *  as many times as we need Nurses
	 */
	public void createNurseList() {
		for (int i = 0; i < NumberOfNurses; i++) {
			nursesstList.add((Nurse) newNurse.getStaffMember(ListOfNames));
		}

	}

	/**
	 * The method creates Array list of Veterinarians by calling "getStaffMember" method
	 *  as many times as we need Veterinarians
	 */
	public void createVetList() {
		for (int i = 0; i < NumberOfVets; i++) {
			vetsList.add((Vet) newVet.getStaffMember(ListOfNames));
		}

	}

	/**
	 *  The method creates Array list of Trainees by calling "getStaffMember" method
	 *  as many times as we need Trainees
	 */
	public void createTraineeList() {
		for (int i = 0; i < NumberOfTrainees; i++) {
			traineesList.add((Trainee) newTrainee.getStaffMember(ListOfNames));
		}

	}

	/**
	 * Create a list of all Staff in clinic by adding all lists of each employee type
	 */
	public void createListOfStaff() {
		allStaff.addAll(sysadminsList);
		allStaff.addAll(receptionistList);
		allStaff.addAll(vetsList);
		allStaff.addAll(nursesstList);
		allStaff.addAll(traineesList);
	}

	/**
	 * Prints all staff
	 */
	public void showAllStaff() {
		for (Staff v : allStaff) {
			System.out.println(v.toString());

		}
	}

	/**
	 * Prints Sysadmins
	 */
	public void showSysadmins() {
		for (Staff v : sysadminsList) {
			System.out.println(v.toString());

		}
	}

	/**
	 * Prints Receptionists
	 */
	public void showReceptionists() {
		for (Staff v : receptionistList) {
			System.out.println(v.toString());

		}
	}

	/**
	 * Prints Nurses
	 */
	public void showNurses() {
		for (Staff v : nursesstList) {
			System.out.println(v.toString());

		}
	}

	/**
	 * Prints Veterinarians
	 */
	public void showVets() {
		for (Staff v : vetsList) {
			System.out.println(v.toString());

		}
	}

	/**
	 * Prints Trainees
	 */
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

	/**We will use it to assign animals to each of those Vets
	 * @return
	 */
	public ArrayList<Vet> getVetsList() {
		return vetsList;
	}

	public void setVetsList(ArrayList<Vet> vetsList) {
		this.vetsList = vetsList;
	}

	public ArrayList<Sysadmin> getSysadminsList() {
		return sysadminsList;
	}

	public void setSysadminsList(ArrayList<Sysadmin> sysadminsList) {
		this.sysadminsList = sysadminsList;
	}

	public ArrayList<Receptionist> getReceptionistList() {
		return receptionistList;
	}

	public void setReceptionistList(ArrayList<Receptionist> receptionistList) {
		this.receptionistList = receptionistList;
	}

}
