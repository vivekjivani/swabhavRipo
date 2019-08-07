let express = require('express');
let app = express();
let http = require('http').Server(app);
let io = require('socket.io')(http);

const PORT = 9090;

app.use(express.static('public'));

io.on('connection', (socket) => {
    console.log('user connected');
});


http.listen(PORT, function callBack() {
    console.log(`server is listning to port : ${PORT}`);
});