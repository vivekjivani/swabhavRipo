let Board = require('./board');
let Mark = require('./Mark');
let Player = require('./player');

class Game {
    constructor(){
        this.board = new Board();
        this.p1 = new Player('vivek',Mark.O);
        this.p2 = new Player('kishan',Mark.X);
        this.currentPlayer = this.p1;
        this.moveCounter = 0;
    }

    makeMove(cellNumber){
        this.board.markOnCell(cellNumber, this.currentPlayer.mark);
        this.moveCounter++;
        this.switchPlayer();
    }
    displayBoard(){
        this.board.printBoard();
    }

    switchPlayer(){
        if((this.moveCounter % 2) == 0){
            this.currentPlayer = this.p1;
        }else{
            this.currentPlayer = this.p2;
        }
    }
}

module.exports = Game;