package com.revature.services;

import java.util.List;

import com.revature.pojos.Animal;
import com.revature.pojos.User;

public interface AnimalService {
	
	public void createAnimal(Animal a);
	
	public Animal getAnimalByName(String name);
	
	public List<Animal> getAnimalsByOwner(User owner);

}
