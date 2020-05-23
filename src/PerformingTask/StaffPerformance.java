package PerformingTask;

import java.util.ArrayList;

import Staff.Staff;
import Staff.Administration.Receptionist;
import Staff.Administration.Sysadmin;

public class StaffPerformance {

	ArrayList<Receptionist> Receptionists;
	ArrayList<Sysadmin> Sysadmins;

	public StaffPerformance(ArrayList<Receptionist> Receptionists, ArrayList<Sysadmin> Sysadmins) {

		this.Receptionists = Receptionists;
		this.Sysadmins = Sysadmins;
	}

	public void showAllActivities() {
		System.out.println("Receptionists:");
		for (Receptionist s : Receptionists) {

			System.out.println(s.getId() + " " + s.getPosition() + "\r\n" + s.getName() + "\r\n" + " Does: ");
			s.doYourDuty();
			System.out.println("\r\n");
		}
		for (Sysadmin s : Sysadmins) {
			System.out.println("Sysadmins:");
			System.out.println(s.getId() + " " + s.getPosition() + "\r\n" + s.getName() + "\r\n" + " Does: ");
			s.doYourDuty();
			System.out.println("\r\n");
		}

	}
}
