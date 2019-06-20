function getPoke() {
    let id = document.getElementById("pokeId").value;

    //AJAX - Asyncrhounous JavaScript and XML
    //allows us to send HTTP requests Asynchronously

    //Step 1. Create XHR
    let xhr = new XMLHttpRequest();

    //Step 2. Define funciton to handle ready state change of response
    //ReadyState - represents how far the response has gotten 
    //0-Request Initialized
    //1-Server Connection Established
    //2-Recieved Request
    //3-Processing Request
    //4-Request Finished & Response Ready
    xhr.onreadystatechange = function() {
        if(xhr.readyState === 4 && xhr.status === 200) {
            let pokemans = JSON.parse(xhr.responseText);
            console.log(pokemans);
            document.getElementById("pokeName").innerHTML = pokemans.name;
        }
    }

    //Step 3. Open XHR
    xhr.open("GET", "http://pokeapi.co/api/v2/pokemon/"+id, true);

    //Step 4. Send XHR
    xhr.send();//<----- takes in data for body of request
}

window.onload = function() {
    document.getElementById("submitId").addEventListener("click", getPoke);
}