package Creator.Animals;

import java.util.ArrayList;

import Animals.Animal;
import Creator.Animals.Generator.AnimAgeGen;

import Creator.Animals.Generator.AnimDiseaseGen;
import Creator.Animals.Generator.AnimNameGen;

public abstract class AnimalsCreator {
	
	protected String name;
	protected int age;
	protected String disease;
	
	AnimNameGen animName = new AnimNameGen();
	AnimAgeGen animAge = new AnimAgeGen();
	AnimDiseaseGen animDisease = new AnimDiseaseGen();

	/**
	 *  * This method passes list of animals names and list of diseases,
	 * then it picks up a random name, disease, age
	 * and  eventually returns Animal
	 * 
	 * @param animNamesList
	 * @param animDiseasesList
	 * @return
	 */
	public abstract Animal getAnimal(ArrayList<String> animNamesList,ArrayList<String> animDiseasesList);
}
