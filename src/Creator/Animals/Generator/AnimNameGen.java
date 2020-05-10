package Creator.Animals.Generator;

import java.util.ArrayList;
import java.util.Random;

public class AnimNameGen {
	
	String animName;
	Random r = new Random();
	/**
	 * Gets a name from a list
	 * 
	 * @return
	 */
	public String getAnimName(ArrayList <String> animNamesList) {

		animName = animNamesList.get(r.nextInt(animNamesList.size()));

		return animName;
	}
}


