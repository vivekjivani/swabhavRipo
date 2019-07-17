import { Component } from "@angular/core";

@Component({
     selector : 'swabhav-welcome',
     templateUrl : './welcome.component.html'
    })
export class WelcomeComponent {
    private message : string;
    constructor(){
        this.message = 'Welcome to swabhav';
    }
}