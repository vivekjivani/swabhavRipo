import { Component } from "@angular/core";

@Component({
     selector : 'app-root',
     templateUrl : './welcome.component.html'
    })
export class WelcomeComponent {
    private message : string;
    constructor(){
        this.message = 'Welcome to swabhav';
    }
}