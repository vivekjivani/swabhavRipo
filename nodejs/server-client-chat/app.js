let express = require('express');
let app = express();
let http = require('http').Server(app);
let io = require('socket.io')(http);
let faker = require('faker');

const PORT = 9090;

app.use(express.static('public'));

let listOfActiveUser = [];

io.on('connect', function (socket) {

    let user = {
        id: socket.id,
        name: faker.name.findName()
    };

    listOfActiveUser.push(user);

    console.log('--------------------------------------------');
    console.log('A user connected : ' + user.name);
    console.log(listOfActiveUser);
    console.log('connected user : ' + listOfActiveUser.length);

    socket.on('clientMessageEvent', function (message, socketId) {
        console.log('Server received : ' + message + ', from Client : ' + socketId);
        io.to(socketId).emit('serverMessageEvent', "Hello Client :" + socketId);
    });

    socket.on('disconnect', function () {
        let elementToRemove = getIndex(this.id);
        console.log('A user disconnected : ' + this.id);

        var index = listOfActiveUser.indexOf(elementToRemove);
        listOfActiveUser.splice(index, 1);
        console.log('Connected users : ' + listOfActiveUser.length);
    });
});

function getIndex(id) {
    listOfActiveUser.forEach((element) => {
        if (element.id == id) {
            return element;
        }
    });
}

http.listen(PORT, function callBack() {
    console.log(`server is listning to port : ${PORT}`);
});