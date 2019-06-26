package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.pojos.Animal;
import com.revature.pojos.User;

public class AnimalServiceFake implements AnimalService {

	private static List<Animal> animalDao = new ArrayList<Animal>();

	public void createAnimal(Animal a) {
		animalDao.add(a);
	}

	public Animal getAnimalByName(String name) {
		Animal a = null;

		for (Animal an : animalDao) {
			if (an.getName().equals(name)) {
				a = an;
				break;
			}
		}

		return a;
	}

	public List<Animal> getAnimalsByOwner(User owner) {
		List<Animal> aList = new ArrayList<Animal>();

		for (Animal an : animalDao) {
			if (an.getOwner().equals(owner)) {
				aList.add(an);
			}
		}

		return aList;
	}

	public AnimalServiceFake() {
		super();
		animalDao.add(new Animal("chewy", "crocodile", 512, new User("mah", "123", "mohamad")));
		animalDao.add(new Animal("jumpy", "lion", 90, new User("mah", "123", "mohamad")));
		animalDao.add(new Animal("raphiel", "tortoise", 73, new User("dinosour", "dev123", "donald")));
	}

}
