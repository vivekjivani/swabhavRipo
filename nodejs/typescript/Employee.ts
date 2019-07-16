export class Employee {
    constructor(private id: number, private name: string, private address: object) {

    }
    public get Id() {
        return this.id;
    }
    public set Id(id: number) {
        this.id = id;
    }
}

export class Address {
    constructor(private city: string, private state: string) {
    }
}