let assert = require('assert');
let expect = require('chai').expect;
let should = require('chai').should();
let Cell = require('../cell');
let Mark = require('../Mark');


describe('Mocha Cell test',() => {
    it('should return mark on cell', () => {
        let cell = new Cell();
        assert.equal(cell.getMark(),Mark.Empty);
    });

    it('should put mark "O" on cell', () => {
        let cell = new Cell();
        cell.putMark(Mark.O);
        assert.equal(cell.getMark(),Mark.O);
    })

    it('should put mark "X" on cell', () => {
        let cell = new Cell();
        cell.putMark(Mark.X);
        assert.equal(cell.getMark(),Mark.X);
    })

    it('should throw exception "cell is already marked"', () => {
        let cell = new Cell();
        cell.putMark(Mark.O);
        expect( () => cell.putMark(Mark.O)).to.throw('already marked');
    })
});