
//classes are templates for objects
//in Angular we use classes for componenets, services, directives, pipes, and many others

export class Person {

    //fields
    age: number;
    name: string;
    birthday: Date;

    private ssn: string;

    protected children: number;

    constructor(age: number, name: string, birthday: Date, ssn: string, children: number) {
        this.age = age;
        this.birthday = birthday;
        this.name = name;
        this.ssn = ssn;
        this.children = children;
    }

    public getSsn(): string {
        return this.ssn;
    }

    public setSsn(ssn: string): void {
        this.ssn = ssn;
    }

    static isPerson(): boolean {
        return true;
    }

}

let person = new Person(50, `john`, new Date(1969, 12, 31), `3838383838312345`, 7);

export default person;

Person.isPerson();