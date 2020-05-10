package Creator.Animals.Generator;

import java.util.Random;

public class AnimAgeGen {

	int Age;
	Random r = new Random();

	public int genAge() {

		Age = r.nextInt(100);

		return Age;
	}

}
