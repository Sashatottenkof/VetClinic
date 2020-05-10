package Creator.Animals;

import java.util.ArrayList;

import Animals.Animal;

import Animals.Dog;

public class DogCreator extends AnimalsCreator {

	@Override
	public Animal getAnimal(ArrayList<String> animNamesList, ArrayList<String> animDiseasesList) {

		name = animName.getAnimName(animNamesList);
		age = animAge.genAge();
		disease = animDisease.getDiseaseName(animDiseasesList);

		return new Dog(name, age, disease);

	}

}
