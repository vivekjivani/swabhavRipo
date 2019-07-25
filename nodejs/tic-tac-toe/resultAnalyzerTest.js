let Board = require('./board');
let Mark = require('./Mark');
let ResultAnalyzer = require('./resultAnalyzer');
let board = new Board();

board.markOnCell(0, Mark.O);
board.markOnCell(1, Mark.X);
board.markOnCell(2, Mark.O);
board.markOnCell(3, Mark.X);
board.markOnCell(4, Mark.O);
board.markOnCell(5, Mark.X);
board.markOnCell(6, Mark.X);
board.markOnCell(7, Mark.O);
board.markOnCell(8, Mark.X);


let analyzer = new ResultAnalyzer(board);
console.log(analyzer.checkForWin());
console.log(analyzer.checkForDraw());


