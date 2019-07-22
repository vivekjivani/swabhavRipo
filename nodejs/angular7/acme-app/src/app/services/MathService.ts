import { Injectable } from '@angular/core';

@Injectable()
export class MathService {
    constructor() {
    }

    cubeEven(number: number){
        if(this.isEven(number)){
            return (number*number*number);
        }
        return 'Number is Not Even';
    }

    isEven(number: number): boolean {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }
}