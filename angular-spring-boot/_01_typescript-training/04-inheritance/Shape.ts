
export class Shape {

    constructor(private theX: number, private theY: number) { }

    public get getX(): number {
        return this.theX;
    }

    public get getY(): number {
        return this.theY;
    }

    getInfo(): string {
        return `Shape:  x= ${this.theX}, y= ${this.theY} `
    }

}