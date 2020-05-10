package Creator.Animals;

import java.util.ArrayList;

import Animals.Animal;
import Animals.Cat;

public class CatCreator extends AnimalsCreator {
	
	

	@Override
	public Animal getAnimal(ArrayList<String> animNamesList, ArrayList<String> animDiseasesList) {

		name = animName.getAnimName(animNamesList);
		age = animAge.genAge();
		disease = animDisease.getDiseaseName(animDiseasesList);

		return new Cat(name, age, disease);

	}

}
