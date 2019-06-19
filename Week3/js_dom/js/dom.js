
function displayGreetings(event) {

    event.preventDefault();
    let username = document.getElementById("username").value || 'default username';
    let password = document.getElementById("password").value || 'default password';
    let form = document.getElementById("loginForm").elements;
    let department = form['department'].value || 'default department';

    let user = makeUser(username, password, department);

    displayMessage(user);

}

function displayMessage(user) {
    let paragraph = document.getElementById("value");
    paragraph.innerHTML = `Welcome ${user.username} to work at the ${user.department} department. Hope you have a great day!!!!`;
}

function makeUser(username, password, department) {
    
    let user = {};
    user.username = username;
    user.password = password;
    user.department = department;

    return user;
}

window.onload = function() {
                                                                //  VV----Callback Function
    document.getElementById("submitButton").addEventListener("click", displayGreetings);

}