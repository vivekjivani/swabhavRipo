let Mark = require('./Mark');
class ResultAnallyzer {
    constructor(board) {
        this.board = board;
    }

    checkForWin() {
		if (this.checkRowForMark(Mark.O)) {
			return true;
		}
		if (this.checkRowForMark(Mark.X)) {
			return true;
		}
		if (this.checkColumnForMark(Mark.O)) {
			return true;
		}
		if (this.checkColumnForMark(Mark.X)) {
			return true;
		}
		if (this.checkDiagonalForMark(Mark.O)) {
			return true;
		}
		if (this.checkDiagonalForMark(Mark.X)) {
			return true;
		}
		return false;
	}

    checkForDraw() {
		if (this.isBoardFillOut()) {
			return true;
		}
		return false;
	}

    checkRowForMark(mark) {
        if (this.board.getMarkOnCell(0) == mark && this.board.getMarkOnCell(1) == mark && this.board.getMarkOnCell(2) == mark) {
            return true;
        }
        if (this.board.getMarkOnCell(3) == mark && this.board.getMarkOnCell(4) == mark && this.board.getMarkOnCell(5) == mark) {
            return true;
        }
        if (this.board.getMarkOnCell(6) == mark && this.board.getMarkOnCell(7) == mark && this.board.getMarkOnCell(8) == mark) {
            return true;
        }
        return false;
    }

    checkColumnForMark(mark) {
        if (this.board.getMarkOnCell(0) == mark && this.board.getMarkOnCell(3) == mark && this.board.getMarkOnCell(6) == mark) {
            return true;
        }
        if (this.board.getMarkOnCell(1) == mark && this.board.getMarkOnCell(4) == mark && this.board.getMarkOnCell(7) == mark) {
            return true;
        }
        if (this.board.getMarkOnCell(2) == mark && this.board.getMarkOnCell(5) == mark && this.board.getMarkOnCell(8) == mark) {
            return true;
        }
        return false;
    }

    checkDiagonalForMark(mark) {
        if (this.board.getMarkOnCell(0) == mark && this.board.getMarkOnCell(4) == mark && this.board.getMarkOnCell(8) == mark) {
            return true;
        }
        if (this.board.getMarkOnCell(2) == mark && this.board.getMarkOnCell(4) == mark && this.board.getMarkOnCell(6) == mark) {
            return true;
        }
        return false;
    }

    isBoardFillOut() {
        if ((this.board.getMarkOnCell(0) == Mark.O) | (this.board.getMarkOnCell(0) == Mark.X)
            && (this.board.getMarkOnCell(1) == Mark.O) | (this.board.getMarkOnCell(1) == Mark.X)
            && (this.board.getMarkOnCell(2) == Mark.O) | (this.board.getMarkOnCell(2) == Mark.X)
            && (this.board.getMarkOnCell(3) == Mark.O) | (this.board.getMarkOnCell(3) == Mark.X)
            && (this.board.getMarkOnCell(4) == Mark.O) | (this.board.getMarkOnCell(4) == Mark.X)
            && (this.board.getMarkOnCell(5) == Mark.O) | (this.board.getMarkOnCell(5) == Mark.X)
            && (this.board.getMarkOnCell(6) == Mark.O) | (this.board.getMarkOnCell(6) == Mark.X)
            && (this.board.getMarkOnCell(7) == Mark.O) | (this.board.getMarkOnCell(7) == Mark.X)
            && (this.board.getMarkOnCell(8) == Mark.O) | (this.board.getMarkOnCell(8) == Mark.X))
            return true;
        return false;
    }

}

module.exports = ResultAnallyzer;