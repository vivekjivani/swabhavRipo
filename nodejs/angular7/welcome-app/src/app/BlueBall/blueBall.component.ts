import { Component } from '@angular/core';
import { IBall } from './IBall';
import { AngularWaitBarrier } from 'blocking-proxy/built/lib/angular_wait_barrier';

@Component({
    selector: 'swabhav-ball-game',
    templateUrl: 'blueBall.component.html'
})
export class BallComponent {
    private ballArray: IBall[] = [];
    private numberOfBalls: number = 50;
    private goalBall: number;
    private status: string = 'Running';
    private gameMove: number = 0;
    private rules: string[] = ['You Have Olny Three Chance To Find Blue Ball.',
        'Green Balls Indicate Blue Ball is at above position.',
        'Red Balls Indicate Blue Ball is at lower position.'];
    private isRuleHidden = false;
    private isGameBoardHidden = true;
    private hidePlayAgain = true;

    constructor() {

    }

    init() {
        this.isRuleHidden = true;
        this.isGameBoardHidden = false;
        for (let index = 0; index < this.numberOfBalls; index++) {
            this.ballArray.push({ id: index, isGoal: false, color: 'white', isDisabled: false });
        }
        this.selectRandomBall();
    }
    selectRandomBall() {
        this.goalBall = Math.floor(Math.random() * Math.floor(this.numberOfBalls))
        this.ballArray[this.goalBall].isGoal = true;
    }
    changeColor(id: number) {
        if (id == this.goalBall) {
            this.status = 'win';
            this.ballArray[id].color = 'blue';
            this.gameOver();
        }
        if (id < this.goalBall) {
            this.ballArray[id].color = 'green';
            this.gameMove++;
            this.checkMove();

        }
        if (id > this.goalBall) {
            this.ballArray[id].color = 'red';
            this.gameMove++;
            this.checkMove();
        }
    }
    checkMove() {
        if (this.gameMove >= 3) {
            this.gameOver();
        }
    }
    gameOver() {
        for (let index = 0; index < this.numberOfBalls; index++) {
            this.ballArray[index].isDisabled = true;
        }
        this.status = 'GameOver';
        this.ballArray[this.goalBall].color = 'blue';
        this.hidePlayAgain = false;
    }

    restartGame(){
        for (let index = 0; index < this.numberOfBalls; index++) {
            this.ballArray[index].isDisabled = false;
            this.ballArray[index].color = 'white';
            this.gameMove = 0;
        }
        this.selectRandomBall();
    }
}