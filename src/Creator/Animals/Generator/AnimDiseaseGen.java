package Creator.Animals.Generator;

import java.util.ArrayList;
import java.util.Random;

public class AnimDiseaseGen {
	String diseaseName;
	Random r = new Random();
	/**
	 * Gets a name from a list
	 * 
	 * @return
	 */
	public String getDiseaseName(ArrayList <String> animNamesList) {

		diseaseName = animNamesList.get(r.nextInt(animNamesList.size()));

		return diseaseName;
	}
}
