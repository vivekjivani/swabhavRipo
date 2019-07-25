let Board = require('./board');
let Mark = require('./Mark');
let Player = require('./player');
let GameStatus = require('./gameStatus');
let ResultAnalizer = require('./resultAnalyzer');

class Game {
    constructor(){
        this.board = new Board();
        this.resultAnalizer = new ResultAnalizer(this.board); 
        this.p1 = new Player('vivek',Mark.O);
        this.p2 = new Player('kishan',Mark.X);
        this.currentPlayer = this.p1;
        this.moveCounter = 0;
        this.gameStatus = GameStatus.InProgress;
    }

   

    makeMove(cellNumber){
        this.board.markOnCell(cellNumber, this.currentPlayer.mark);
        this.moveCounter++;
        this.checkGameStatus();
    }

    checkGameStatus(){
        if(this.isGameWin()){
            this.gameStatus = GameStatus.Win;
        }
        if(this.isGameDraw()){
            this.gameStatus = GameStatus.Draw;
        }
        if(this.gameStatus == GameStatus.InProgress){
            this.switchPlayer();
        }
    }

    isGameWin(){
        return this.resultAnalizer.checkForWin();
    }

    isGameDraw(){
        return this.resultAnalizer.checkForDraw();
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