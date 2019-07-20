import { Component, Output, EventEmitter, Input } from '@angular/core';


@Component({
    selector: 'star-rating',
    templateUrl: `./starRatingComponent.html`
})
export class StarRating {

    @Input()
    starRating: number;

    constructor() {
        console.log('Inside Constructor');
        console.log(this.starRating);
    }

    ngOnInit() {
        console.log('Inside ngOnInit');
        console.log(this.starRating);
        // this.starRating = this.starRating;
    }
}