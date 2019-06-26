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

window.onload = function () {
	
	getMyPets();
	
}