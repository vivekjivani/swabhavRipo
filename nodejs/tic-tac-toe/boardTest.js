let Board = require('./board');
let Mark = require('./Mark');

let board= new Board();

board.markOnCell(1,Mark.X);
board.printBoard();