let assert = require('assert');
let expect = require('chai').expect;
let should = require('chai').should();
let Cell = require('../cell');
let Mark = require('../Mark');
let Board = require('../board');
let Player = require('../player');
let ResultAnaluyzer = require('../resultAnalyzer');

describe('Mocha ResultAnaluyzer Test', () => {
    it('checks for win should return true', () => {
        let board = new Board();
        board.markOnCell(0, Mark.O);
        board.markOnCell(1, Mark.O);
        board.markOnCell(2, Mark.O);

        let analyzer = new ResultAnaluyzer(board);
        expect(analyzer.checkForWin()).to.be.true;
    });

    it('checks for win should return false', () => {
        let board = new Board();
        board.markOnCell(0, Mark.O);
        board.markOnCell(2, Mark.O);
        board.markOnCell(4, Mark.O);

        let analyzer = new ResultAnaluyzer(board);
        expect(analyzer.checkForWin()).to.be.false;
    })

    it('check for draw should return true', () => {
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
        let analyzer = new ResultAnaluyzer(board);
        expect(analyzer.checkForDraw()).to.be.true;
    });

    it('check for draw should return false', () => {
        let board = new Board();
        board.markOnCell(0, Mark.O);
        board.markOnCell(1, Mark.X);
        board.markOnCell(2, Mark.O);
        board.markOnCell(3, Mark.X);
        let analyzer = new ResultAnaluyzer(board);
        expect(analyzer.checkForDraw()).to.be.false;
    });

    it('check for draw should return true', () => {
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
        let analyzer = new ResultAnaluyzer(board);
        expect(analyzer.checkForDraw()).to.be.true;
    });

    it('check for board is filled out should return true', () => {
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
        let analyzer = new ResultAnaluyzer(board);
        expect(analyzer.isBoardFillOut()).to.be.true;
    });

    it('check for three same mark in row and it should return true', () => {
        let board = new Board();
        board.markOnCell(0, Mark.O);
        board.markOnCell(1, Mark.O);
        board.markOnCell(2, Mark.O);
        let analyzer = new ResultAnaluyzer(board);
        expect(analyzer.checkRowForMark(Mark.O)).to.be.true;
    });

    it('check for three same mark in row and it should return false', () => {
        let board = new Board();
        board.markOnCell(0, Mark.O);
        board.markOnCell(3, Mark.O);
        board.markOnCell(6, Mark.O);
        let analyzer = new ResultAnaluyzer(board);
        expect(analyzer.checkRowForMark(Mark.O)).to.be.false;
    });

    it('check for three same mark in column and it should return true', () => {
        let board = new Board();
        board.markOnCell(0, Mark.X);
        board.markOnCell(3, Mark.X);
        board.markOnCell(6, Mark.X);
        let analyzer = new ResultAnaluyzer(board);
        expect(analyzer.checkColumnForMark(Mark.X)).to.be.true;
    });

    
    it('check for three same mark in column and it should return false', () => {
        let board = new Board();
        board.markOnCell(0, Mark.X);
        board.markOnCell(1, Mark.X);
        board.markOnCell(2, Mark.X);
        let analyzer = new ResultAnaluyzer(board);
        expect(analyzer.checkColumnForMark(Mark.X)).to.be.false;
    });

    
    it('check for three same mark in diagonal and it should return true', () => {
        let board = new Board();
        board.markOnCell(0, Mark.X);
        board.markOnCell(4, Mark.X);
        board.markOnCell(8, Mark.X);
        let analyzer = new ResultAnaluyzer(board);
        expect(analyzer.checkDiagonalForMark(Mark.X)).to.be.true;
    });

    it('check for three same mark in diagonal and it should return false', () => {
        let board = new Board();
        board.markOnCell(2, Mark.X);
        board.markOnCell(1, Mark.X);
        board.markOnCell(0, Mark.X);        
        let analyzer = new ResultAnaluyzer(board);
        expect(analyzer.checkDiagonalForMark(Mark.X)).to.be.false;
    });
});