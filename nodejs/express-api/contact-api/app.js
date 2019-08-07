let Express = require('express');
let BodyParser = require('body-parser');
let Cors = require('cors');
let swaggerJSDoc = require('swagger-jsdoc');
let ContactController = require('./controllers/ContactController');

let app = Express();
const PORT = 8080;

//Swagger start
var swaggerJSDoc = require('swagger-jsdoc');
var swaggerDefinition = {
  info: {
    title: 'Contact App',
    version: '1.0.0',
    description: '<h2>CopyRight &copy; SwabhavTechlabs<h2>',
  },
  host: `localhost:${PORT}`,
  basePath: '/',
};

var options = {
  // import swaggerDefinitions
  swaggerDefinition: swaggerDefinition,
  // path to the API docs
  apis: ['./controllers/*.js'],
};
var swaggerSpec = swaggerJSDoc(options);
app.get('/swagger.json', function(req, res) {
  res.setHeader('Content-Type', 'application/json');
  res.send(swaggerSpec);
});
//swagger end

    app.use(Cors());
    app.use(BodyParser.json());
    app.use(Express.static('public'));

    let contactController = new ContactController(app);

    app.listen(PORT, function callBackWelcome() {
        console.log('Server is running on port number :', PORT);
    });
