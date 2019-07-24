let Cell = require('./cell');

class Board {
    constructor() {
        this.cells = [];
        for (let index = 0; index < 9; index++) {
            let cell = new Cell();
            this.cells.push(cell);
        }
    }

    markOnCell(cellNumber, mark) {
        this.cells[cellNumber].putMark(mark);
    }

    printBoard() {
        for (let i = 0; i < 9; i++) {
           console.log(this.cells[i]);
        }
    }
}

module.exports = Board;