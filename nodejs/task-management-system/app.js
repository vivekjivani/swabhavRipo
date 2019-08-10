const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
const UserController = require('./controllers/UserController');
let app = express();

const PORT = 9090;

app.use(cors());
app.use(bodyParser.json());

new UserController(app);

app.listen(PORT, function callBack() {
    console.log(`server is running on localhost:${PORT}`);
});


// let session = require('express-session');
// app.use(session({ secret: "it's secret!!" }));
