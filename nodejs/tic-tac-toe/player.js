
class Player {
    constructor(name, mark){
        this.name = name;
        this.mark = mark;
    }

    getPlayerMark(){
        return this.mark;
    }

    getPlayerName(){
        return this.name;
    }
}

module.exports = Player;