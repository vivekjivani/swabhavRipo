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

    getMarkOnCell(cellNumber) {
        return this.cells[cellNumber].getMark();
    }

    printBoard() {
        for (let i = 0; i < 9; i += 3) {
            let row = "";
            for (let j = i; j < 3 + i && j < 9; j++) {
                row += this.cells[j].getMark() + "\t";
            }
            console.log(row);
        }
    }
}

module.exports = Board;