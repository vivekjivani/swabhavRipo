let assert = require('assert');
let expect = require('chai').expect;
let should = require('chai').should();
let gameStatus = require('../gameStatus');
let Cell = require('../cell');
let Mark = require('../Mark');
let Board = require('../board');
let Player = require('../player');
let ResultAnaluyzer = require('../resultAnalyzer');
let Game = require('../Game');

describe('Mocha test for Game', ()=>{
    it('should put mark on given cell number with current player mark', ()=>{
        let game = new Game();
        let mark = game.currentPlayer.getPlayerMark();
        game.makeMove(1);
        assert.equal(game.board.getMarkOnCell(1),mark);
    });

    it('should change the current player', ()=>{
        let game = new Game();
        let player = game.currentPlayer;
        game.makeMove(1);
        function isPlayerChnaged(){
            if(player != game.currentPlayer){
                return true;
            }
        }
        expect(isPlayerChnaged()).to.be.true;
    });

    it('should return gameStatus inprogress', ()=>{
        let game = new Game();
        assert.equal(game.gameStatus,gameStatus.InProgress);
    })

    it('should return gameStatus win', ()=>{
        let game = new Game();
        game.makeMove(0);
        game.makeMove(8);
        game.makeMove(1);
        game.makeMove(7);
        game.makeMove(2);
        assert.equal(game.gameStatus,gameStatus.Win);
    });

    it('should return gameStatus Draw', ()=>{
        let game = new Game();
        game.makeMove(0);
        game.makeMove(1);
        game.makeMove(2);
        game.makeMove(3);
        game.makeMove(4);
        game.makeMove(5);
        game.makeMove(7);
        game.makeMove(6);
        game.makeMove(8);

        assert.equal(game.gameStatus,gameStatus.Draw);
    });
});