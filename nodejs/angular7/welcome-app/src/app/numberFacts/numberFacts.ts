import { Component } from '@angular/core';
import { NumberApiService } from '../services/NumberApiService';

@Component({
    templateUrl : './numberFacts.html',
    selector : 'number-fact'
})
export class NumberFact {
    private fact:any;
    constructor( private service : NumberApiService ){

    }

    getFactOf(number){
        this.service.getFact(number).then(
            (response) => {
                //console.log(response);
                this.fact = response;
            }
        ).catch(
            (error) => {
                console.log(error.error);
                this.fact =error.error
            }
        );        
    }
}