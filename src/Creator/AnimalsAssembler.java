package Creator;

import java.io.IOException;
import java.util.ArrayList;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Tiger;
import Creator.Animals.CatCreator;
import Creator.Animals.DogCreator;
import Creator.Animals.TigerCreator;
import ReadFromFile.ReadAnimals;
import ReadFromFile.ReadAnimalsDiseases;

public class AnimalsAssembler {

	int NumberOfCats = 300;
	int NumberOfDogs = 350;
	int NumberOfTigers = 350;

	ArrayList<String> animNamesList = new ArrayList<String>();
	ArrayList<String> animDiseasesList = new ArrayList<String>();

	ReadAnimals readNames = new ReadAnimals();
	ReadAnimalsDiseases readDisease = new ReadAnimalsDiseases();

	CatCreator newCat = new CatCreator();
	DogCreator newDog = new DogCreator();
	TigerCreator newTiger = new TigerCreator();

	ArrayList<Cat> catsList = new ArrayList<Cat>();
	ArrayList<Dog> dogsList = new ArrayList<Dog>();
	ArrayList<Tiger> tigersList = new ArrayList<Tiger>();

	ArrayList<Animal> allAnimals = new ArrayList<Animal>();

	public AnimalsAssembler() {
		readAnimalNames();
		readAnimalDiseases();
		createCatsList();
		createDogsList();
		createTigersList();
		creatAllAnimalsList();
	}

	public void readAnimalNames() {
		try {
			animNamesList = readNames.getAnimNamesList();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void readAnimalDiseases() {
		try {
			animDiseasesList = readDisease.getAnimDiseasesList();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void createCatsList() {
		for (int i = 0; i < NumberOfCats; i++) {
			catsList.add((Cat) newCat.getAnimal(animNamesList, animDiseasesList));
		}
	}

	public void createDogsList() {
		for (int i = 0; i < NumberOfDogs; i++) {
			dogsList.add((Dog) newDog.getAnimal(animNamesList, animDiseasesList));
		}

	}

	public void createTigersList() {
		for (int i = 0; i < NumberOfTigers; i++) {
			tigersList.add((Tiger) newTiger.getAnimal(animNamesList, animDiseasesList));
		}

	}

	public void creatAllAnimalsList() {

		allAnimals.addAll(catsList);
		allAnimals.addAll(dogsList);
		allAnimals.addAll(tigersList);

	}

	/**
	 * we will use it to search for animals
	 * 
	 * @return
	 */
	public ArrayList<Animal> getAllAnimals() {
		return allAnimals;
	}

	public void setAllAnimals(ArrayList<Animal> allAnimals) {
		this.allAnimals = allAnimals;
	}

	public void showCatsList() {

		for (Cat v : catsList) {

			System.out.println(v.toString());

		}

	}

	public void showDogsList() {

		for (Dog v : dogsList) {

			System.out.println(v.toString());

		}

	}

	public void showTigersList() {

		for (Tiger v : tigersList) {

			System.out.println(v.toString());

		}

	}

	public void showAllAnimList() {

		for (Animal v : allAnimals) {

			System.out.println(v.toString());

		}

	}

}
