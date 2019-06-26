/**
 * 
 */

function getMyPets() {
	
	let xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function () {
		if (xhr.readyState === 4 && xhr.status === 200) {
			let pets = xhr.responseText;
			console.log(pets);
			document.getElementById("pet-list").innerHTML = pets;
		}
	}
	
	xhr.open("GET", "/ServletExample/animal", true);
	
	xhr.send();
	
}

function getPetByName() {
	let petName = document.getElementById("pet-name-input").value;
	
	let xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function () {
		if (xhr.readyState === 4 && xhr.status === 200) {
			let pet = JSON.parse(xhr.responseText);
			console.log(pet);
			displayPet(pet);
		}
	}
	
	xhr.open("GET", "/ServletExample/animal/" + petName, true);
	
	xhr.send();
}

function displayPet (pet) {
	let petString = "Name: " + pet.name + "\n" +
		"Breed: " + pet.breed + "\n" +
		"Age: " + pet.age + "\n" +
		"Owner: " + pet.owner.fullname;
	document.getElementById("my-pet").innerHTML = petString;
}

function postAnimal() {

	let name = document.getElementById("name").value;
	let breed = document.getElementById("breed").value;
	let age = document.getElementById("age").value;

	let animal = new Animal(name, breed, age);

	let xhr = new XMLHttpRequest();

	xhr.onreadystatechange = function() {

		if (xhr.readyState === 4 && xhr.status === 200) {
			document.getElementById("result").innerHTML = xhr.responseText;
			getMyPets();
		}

	}

	xhr.open("POST", "/ServletExample/animal/", true);

	xhr.send(JSON.stringify(animal));

}

let Animal = function(name, breed, age) {
	this.name = name;
	this.breed = breed;
	this.age = age;
}


window.onload = function () {
	
	getMyPets();
	document.getElementById("get-pet").addEventListener("click", getPetByName);
	document.getElementById("postAnimal").addEventListener("click", postAnimal);
}