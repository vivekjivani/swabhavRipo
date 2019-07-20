import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
    templateUrl: './toggelButtonComponent.html',
    selector: 'toggel-button'
})
export class ToggelButtonComponent implements OnInit {
    @Input()
    private state: number = 1;
    @Input()
    private textValue: string;
    @Input()
    private onColor: string;
    @Input()
    private offColor: string;
    @Output()
    stateChanged: EventEmitter<Number>;
    private color: string;

    constructor() {
        this.stateChanged = new EventEmitter<Number>();
        console.log('Inside Constructor');
        console.log(this.textValue);
        console.log(this.onColor);
        console.log(this.offColor);
    }

    ngOnInit() {
        console.log('Inside ngOnInit');
        console.log(this.textValue);
        console.log(this.onColor);
        console.log(this.offColor);
        this.color = this.onColor;
    }

    toggler() {
        this.stateChanged.emit(this.state);
        this.state = (1 - this.state);
        if (this.color == this.onColor) {
            this.color = this.offColor;
        } else {
            this.color = this.onColor;
        }
    }
}