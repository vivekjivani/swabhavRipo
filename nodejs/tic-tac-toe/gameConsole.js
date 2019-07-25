let Game = require('./Game');
let GameStatus = require('./gameStatus');
let ReadLine = require('readline-sync');

class GameConsole {
    constructor() {
        this.game = new Game();
    }
    start() {
        while (this.game.gameStatus == GameStatus.InProgress) {
            console.log('*************************');
            console.log('Game Status : ' + this.game.gameStatus);
            console.log('Current Player : ' + this.game.currentPlayer.getPlayerName());
            let cellNumber = ReadLine.question('Enter Cell Number : ');
            console.log('*************************');            
            this.game.makeMove(cellNumber);
            this.game.board.printBoard();
        }
        if (this.game.gameStatus == GameStatus.Win) {
            console.log('*************************');
            console.log('Winnner is : ' + this.game.currentPlayer.getPlayerName());
            console.log('*************************');
        }
        if (this.game.gameStatus == GameStatus.Draw) {
            console.log('*************************');
            console.log('Game Draw..');
            console.log('*************************');
        }
    }
}

module.exports = GameConsole;