package PerformingTask;

import java.util.ArrayList;
import java.util.Random;

import Staff.Administration.Receptionist;
import Staff.Administration.Sysadmin;

public class StaffPerformance {

	// Array of activities that Receptionists might perform
	String ResTasks[] = { "Making a call phones", "Working with documents", "On quarantine", "On meeting", " Sick",
			"On hollidays" };
	// Array of activities that Sysadmins might perform
	String SysTasks[] = { "Istalling Software", "Playing World Of Tanks", "Working remotely", "Setting up a network",
			" Sick", "Help desk", "On hollidays" };

	ArrayList<Receptionist> Receptionists;
	ArrayList<Sysadmin> Sysadmins;
	Random r = new Random();

	public StaffPerformance(ArrayList<Receptionist> Receptionists, ArrayList<Sysadmin> Sysadmins) {

		this.Receptionists = Receptionists;
		this.Sysadmins = Sysadmins;
		RecepTask();
		SysadminTask();
	}

	/**
	 * Chooses random task for Receptionists from the array
	 * 
	 */
	public void RecepTask() {
		String Task = null;
		int Index;
		for (Receptionist s : Receptionists) {
			Index = r.nextInt(ResTasks.length);
			Task = ResTasks[Index];
			s.setTask(Task);
		}

	}

	/**
	 * Chooses random task for Sysadmins from the array
	 */
	public void SysadminTask() {
		String Task = null;
		int Index;
		for (Sysadmin s : Sysadmins) {
			Index = r.nextInt(SysTasks.length);
			Task = SysTasks[Index];
			s.setTask(Task);
		}

	}

	/**
	 * Prints a response
	 */
	public void showAllActivities() {
		System.out.println("Receptionists:");
		for (Receptionist s : Receptionists) {

			System.out.println(s.getPosition() + "\r\n" + " ID: " + s.getId() + "\r\n" + s.getName() + "\r\n"
					+ " Does: " + s.getTask() + "\r\n");

		}
		System.out.println("Sysadmins:");
		for (Sysadmin s : Sysadmins) {

			System.out.println(s.getPosition() + "\r\n" + " ID: " + s.getId() + "\r\n" + s.getName() + "\r\n"
					+ " Does: " + s.getTask() + "\r\n");

		}

	}

}
