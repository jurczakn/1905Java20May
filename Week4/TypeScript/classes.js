"use strict";
//classes are templates for objects
//in Angular we use classes for componenets, services, directives, pipes, and many others
exports.__esModule = true;
var Person = /** @class */ (function () {
    function Person(age, name, birthday, ssn, children) {
        this.age = age;
        this.birthday = birthday;
        this.name = name;
        this.ssn = ssn;
        this.children = children;
    }
    Person.prototype.getSsn = function () {
        return this.ssn;
    };
    Person.prototype.setSsn = function (ssn) {
        this.ssn = ssn;
    };
    Person.isPerson = function () {
        return true;
    };
    return Person;
}());
exports.Person = Person;
var person = new Person(50, "john", new Date(1969, 12, 31), "3838383838312345", 7);
exports["default"] = person;
Person.isPerson();
