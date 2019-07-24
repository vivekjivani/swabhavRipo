let Mark = require('./Mark');
let Cell = require('./cell');
let cells = [];

for (let index = 0; index < 9; index++) {
    let cell = new Cell();
    cells.push(cell);
}

cells[0].putMark(Mark.O);

cells.forEach(ele => {
    console.log(ele.getMark());
});

//cells[0].putMark(Mark.O);