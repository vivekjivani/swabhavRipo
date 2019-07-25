let assert = require('assert');
let expect = require('chai').expect;
let should = require('chai').should();
let Cell = require('../cell');
let Mark = require('../Mark');
let Board = require('../board');

describe('Mocha Board Test',() => {
    it('should push 9 cell in cells array',()=>{
        let board = new Board();
        assert.equal(board.cells.length,9);
    })

    it('should Mark on given cell number', () => {
        let board = new Board();
        board.markOnCell(1, Mark.O);
        assert.equal(board.cells[1].getMark(), Mark.O);
    })

    it('should return mark on given cell numebr', () =>{
        let board = new Board();
        board.markOnCell(1, Mark.X);
        assert.equal(board.getMarkOnCell(1), Mark.X);
    })
})