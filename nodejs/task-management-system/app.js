const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
const UserController = require('./controllers/UserController');
let session = require('express-session');
let app = express();

const PORT = 9090;

app.use(cors());
app.use(bodyParser.json());
app.use(session({ secret: "it's secret!!" }));

new UserController(app);

app.listen(PORT, function callBack() {
    console.log(`server is running on localhost:${PORT}`);
});