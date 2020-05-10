package Creator.Animals;

import java.util.ArrayList;

import Animals.Animal;
import Animals.Tiger;

public class TigerCreator extends AnimalsCreator {

	@Override
	public Animal getAnimal(ArrayList<String> animNamesList, ArrayList<String> animDiseasesList) {
		name = animName.getAnimName(animNamesList);
		age = animAge.genAge();
		disease = animDisease.getDiseaseName(animDiseasesList);

		return new Tiger(name, age, disease);
	}

}
