import { Component, OnInit, Input, Output } from '@angular/core';

@Component({
    templateUrl: './toggelButtonComponent.html',
    selector: 'toggel-button'
})
export class ToggelButtonComponent implements OnInit {
    @Input()
    private state: number;
    @Input()
    private textValue: string;
    @Input()
    private onColor: string;
    @Input()
    private offColor: string;
    @Output()
    private color: string;

    constructor() {
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
        this.state = (1 - this.state);
        if (this.color == this.onColor) {
            this.color = this.offColor;
        } else {
            this.color = this.onColor;
        }
    }
}