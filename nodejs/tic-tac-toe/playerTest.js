let Mark = require('./Mark');
let Player = require('./player');

let p1 = new Player('vivek', Mark.X);
let p2 = new Player('karan', Mark.O);

console.log(
p1.getPlayerMark());
console.log(
p1.getPlayerName());