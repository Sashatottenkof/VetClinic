
package Creator.Staff.Generator;

import java.util.Random;

public class StaffSalaryGen {
	int salary;
	Random r = new Random();
	/** generate random salary level
	 * @return
	 */
	public int getSalary() {

		salary = r.nextInt(5)+1;
		return salary;
	}
}
