let Mark = require('./Mark');
class Cell {
    constructor(){
        this.cellState = Mark.Empty;
    }

    getMark(){
        return this.cellState;
    }

    putMark(mark){
        if(this.cellState == Mark.Empty){
            this.cellState = mark;
        }else{
            throw new 'already marked';
        }
    }
}

module.exports = Cell;