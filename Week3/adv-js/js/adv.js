function makeUser(username, password, department) {

    let user = {};
    user.username = username;
    user.password = password;
    user.department = department;

    return user;
}

var User = function (username, password, department) {
    this.username = username;
    this.password = password;
    this.department = department;
}

var ashton = new User('Ashton', 'I like pizza', 'HR');

User.prototype.changePassword = function (newPassword) {
    this.password = newPassword;
}

User.prototype.login = function (password) {
    if (this.password === password) {
        console.log(`${this.username}: Welcome to our system and the ${this.department} department`);
    }
}

var Admin = function () { };
Admin.prototype = new User();
Admin.prototype.deleteUser = function (user) {
    user.username = '';
    user.password = '';
    user.department = '';
}

class UserClass {

    constructor(username, password, department) {
        this.username = username;
        this.password = password;
        this.department = department;
    }

    changePassword(newPassword) {
        this.password = newPassword;
    };
    
    login(password) {
        if (this.password === password) {
            console.log(`${this.username}: Welcome to our system and the ${this.department} department`);
        }
    }
    
}

class AdminClass extends User {

    constructor(username, password, department) {
        super(username, password, department);
    }

    deleteUser(user) {
        user.username = '';
        user.password = '';
        user.department = '';
    }

}