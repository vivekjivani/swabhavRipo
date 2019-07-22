import { Component } from "@angular/core";

@Component({
    selector: 'swabhav-welcome',
    templateUrl: './welcome.component.html'
})
export class WelcomeComponent {
    private message: string;
    private childState: number;
    constructor() {
        this.message = 'Welcome to swabhav';
    }
    getDataFromChild(e) {
        this.childState = e;
        console.log('hi ' + e);

    }
}