//Interfaces are contracts for other classes and objects
//Can be used to define a custom type without created a class
//Intefaces ARE NOT transpiled into JS. Only  used by the Type Checker.
import {Person} from './classes';
import person from './classes';


interface Revature{

    hasLearned: boolean;
    associates: Array<Person>;
    curriculum: string;
    isFun?: boolean;  //? allows us to have optional fields

    doThis?(): void;

}

class SuperRevature implements Revature {
    hasLearned: boolean;

    associates: Array<Person>;
    curriculum: string;
}

let revature: Revature;

revature = {hasLearned: true, associates: [person], curriculum: `Java`, doThis: ()=>{console.log(this.associates[0].getSsn());}};

revature = {hasLearned: true, associates: [person], curriculum: `Java`, isFun: true};

console.log(person.getSsn);