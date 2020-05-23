package Creator.Animals.Generator;

import java.util.Random;

public class AnimAgeGen {

	int Age;
	Random r = new Random();

	/**
	 * we pick up random age from o to 30
	 * @return
	 */
	public int genAge() {

		Age = r.nextInt(30);

		return Age;
	}

}
