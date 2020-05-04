import { Shape } from "./Shape";

export class Circle extends Shape {

    constructor(private theX: number, private theY: number, private _radius: number) {
        super(theX, theY);
    }

}