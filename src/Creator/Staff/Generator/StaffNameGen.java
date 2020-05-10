
package Creator.Staff.Generator;

import java.util.ArrayList;
import java.util.Random;

public class StaffNameGen {

	String Name;
	Random r = new Random();

	/**
	 * Gets a name from a list
	 * 
	 * @return
	 */
	public String getName(ArrayList<String> ListOfNames) {

		Name = ListOfNames.get(r.nextInt(ListOfNames.size()));

		return Name;
	}
}
