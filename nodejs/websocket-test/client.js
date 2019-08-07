var WebSocketClient = require('websocket').client;

var client = new WebSocketClient();


client.on('connect', function (connection) {
    console.log('WebSocket Client Connected');

    connection.sendUTF('Hello Server');

    connection.on('message', function (message) {
        if (message.type === 'utf8') {
            console.log("Received: '" + message.utf8Data + "'");
        }
    });

});

client.connect('ws:// localhost:8080/');