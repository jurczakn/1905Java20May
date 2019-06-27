// Typescript typing allows us to define types of our variables
let myString: string;

myString = `this is a string`;

//try to assign a number to a string
//myString = 4;

//we can also infer types
let anotherString: `this is a string without :string`;

//anotherString = 22;

let yetAnotherString;// being assigned to any... DO NOT DO

yetAnotherString = `this string`;

yetAnotherString = 17;

//Other basic types

let tupleType: [string, number];

tupleType = [`string`, 0];
//tupleType = [0, `string`];

let aNumber: number;

let aBoolean: boolean;

let anArray: Array<string>;

let anything: any; //do not use

let nothing: void;

let not: never;

