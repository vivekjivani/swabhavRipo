const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');
const UserController = require('./controllers/UserController');
const mongoose = require('mongoose');
// const usersSchema = require('../schemas/usersSchema');
const uri = "mongodb+srv://admin:root@cluster0-sjbot.mongodb.net/"
    + "task_managemnet_system?retryWrites=true&w=majority";


mongoose.set('useNewUrlParser', true);
mongoose.set('useFindAndModify', false);
mongoose.set('useCreateIndex', true);

mongoose.connect(uri, { useNewUrlParser: true })
    .then(
        (result) => {
            console.log('database connected..');
        }
    )
    .catch(
        (error) => {
            console.log(error);
        }
    );
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
