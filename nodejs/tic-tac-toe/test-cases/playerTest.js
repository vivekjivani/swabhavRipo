let assert = require('assert');
let expect = require('chai').expect;
let should = require('chai').should();
let Cell = require('../cell');
let Mark = require('../Mark');
let Board = require('../board');
let Player = require('../player');

describe('Mocha player test',()=>{
    it('should create player with given name and given mark',()=>{
        let p1 = new Player('vivek',Mark.X);
        assert.equal(p1.name,'vivek');
        assert.equal(p1.mark,Mark.X);
    });

    it('should return player name', ()=>{
        let p1 = new Player('karan',Mark.O);
        assert.equal(p1.getPlayerName(),'karan');
    });

    it('should return player mark', ()=>{
        let p1 = new Player('paras',Mark.X);
        assert.equal(p1.getPlayerMark(),Mark.X);
    })
});