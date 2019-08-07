var WebSocketServer = require('websocket').server;
var http = require('http');

var server = http.createServer(function (request, response) {
    console.log(' Received request for ' + request.url);
    response.write('welcome');
    response.end();
});

server.listen(8080, function () {
    console.log(' Server is listening on port 8080');
});

wsServer = new WebSocketServer({
    httpServer: server
});


wsServer.on('request', function (request) {
    var connection = request.accept(null, request.origin);

    connection.sendUTF('Hello From Server');

    connection.on('message', function (message) {
        if (message.type === 'utf8') {
            console.log('Server Received Message: ' + message.utf8Data);
        }
    });
});