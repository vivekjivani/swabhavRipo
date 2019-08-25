const express = require('express');

//middlewares import
const cors = require('cors');
const bodyParser = require('body-parser');
const swaggerJSDoc = require('swagger-jsdoc');

//controllers import
const UserController = require('./controllers/UserController');
const TaskController = require('./controllers/TaskController');
const SubtaskController = require('./controllers/SubtaskController');

const mongoose = require('mongoose');
const uri = "mongodb+srv://admin:root@cluster0-bd9bp.mongodb.net/task-management-system?retryWrites=true&w=majority";

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


let swaggerDefinition = {
    info: {
        title: 'taskManagement API documentation',
        version: '1.0.0',
        description: '<h2>CopyRight &copy; SwabhavTechlabs<h2>',
    },
    host: `localhost:${PORT}`,
    basePath: '/',
};
var options = {
    swaggerDefinition: swaggerDefinition,
    apis: ['./controllers/*.js'],
};
var swaggerSpec = swaggerJSDoc(options);
app.get('/swagger.json', function(req, res) {
    res.setHeader('Content-Type', 'application/json');
    res.send(swaggerSpec);
});

app.use(express.static('public'));
app.use(cors());
app.use(bodyParser.json());

new UserController(app);
new TaskController(app);
new SubtaskController(app);

app.listen(PORT, function callBack() {
    console.log(`server is running on localhost:${PORT}`);
});


// let session = require('express-session');
// app.use(session({ secret: "it's secret!!" }));
