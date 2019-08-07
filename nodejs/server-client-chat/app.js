let express = requier('express');
let app = express();
let http = require('http').Server(app);
let io = require('socket.io')(http);
const PORT = 8080;

app.use(express.static('public'));

io.on('connection', function (socket) {
    console.log('A new WebSocket connection has been established');
});

io.

app.listen(8080, function callBack() {
    console.log(`Server Running at Port ${PORT}`);
});