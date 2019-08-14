let userModel = require('../schemas/usersSchema');

const mongoose = require('mongoose');
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

