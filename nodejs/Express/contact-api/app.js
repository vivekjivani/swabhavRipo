let Express = require('express');
let cors = require('cors');
let bodyParser = require('body-parser');
let app = Express();
var swaggerJSDoc = require('swagger-jsdoc');
var swaggerDefinition = {
    info: {
        title: 'Contact App API Documentation',
        version: '1.0.0',
        description: '<h2>CopyRight &copy; SwabhavTechlabs<h2>',
    },
    host: `localhost:8080`,
    // host: `localhost:${port}`,
    basePath: '/',
};

var options = {
    // import swaggerDefinitions
    swaggerDefinition: swaggerDefinition,
    // path to the API docs
    apis: ['./controller/*.js'],
};
var swaggerSpec = swaggerJSDoc(options);

app.use(cors());
app.use(bodyParser.json());
module.exports = app;