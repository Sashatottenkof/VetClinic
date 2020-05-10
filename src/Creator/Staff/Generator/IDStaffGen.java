
package Creator.Staff.Generator;

public class IDStaffGen {

	private static int StaffId;

	
	public IDStaffGen() {

		StaffId = 100;

	}

	
	/**
	 * That method generates unique Id every time its calls by incrementing number itself;
	 * @return
	 */
	public int getId() {

		this.StaffId++;
		return StaffId;
	}

}
