package Creator.Animals;

import java.util.ArrayList;

import Animals.Animal;
import Animals.Snake;

public class SnakeCreator extends AnimalsCreator {

	

	@Override
	public Animal getAnimal(ArrayList<String> animNamesList, ArrayList<String> animDiseasesList) {
		name = animName.getAnimName(animNamesList);
		age = animAge.genAge();
		disease = animDisease.getDiseaseName(animDiseasesList);

		return new Snake (name, age, disease);
	}

}
