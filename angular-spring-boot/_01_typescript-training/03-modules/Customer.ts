export class Customer {
    constructor(private _firstName: string, private _lastName: string) { }

    public get firstName(): string {
        return this._firstName;
    }

    public get lastName(): string {
        return this._lastName;
    }
}
