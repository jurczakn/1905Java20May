import person from './classes';
import {Person} from './classes';

let numArray: Array<number>;

numArray = [2, 3, 6, 234, 6435, 23, 6, 2];

numArray = [`alsdf`, `aowsie`];

function identity<T>(arg: T): T{
    return arg;
}

console.log(identity(`hi`));

console.log(identity(person));

interface GenericInterface<T> {
    stuff: T;
}

class GenericClass<T> {
    stuff: T;
    stuff2: T;

    add: (x:T, y:T) => T;
}

let myObj: GenericClass<Person>;