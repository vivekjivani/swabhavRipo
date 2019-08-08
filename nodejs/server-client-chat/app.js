let express = require('express');
let app = express();
let http = require('http').Server(app);
let io = require('socket.io')(http);

const PORT = 9090;

app.use(express.static('public'));

io.on('connection', function (socket) {
    console.log(socket.id);
    console.log('A new WebSocket connection has been established');
    socket.on('messageEventClient', function (message) {
        console.log('Server received : ' + message);
        io.emit('messageEventServer', "Hello");    
    });
});

http.listen(PORT, function callBack() {
    console.log(`server is listning to port : ${PORT}`);
});