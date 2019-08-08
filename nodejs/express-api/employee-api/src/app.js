let express = require('express');
let bodyParser = require('body-parser');
let cors = require('cors');
let employeeController = require('./controllers/EmployeeController');
let departmentController = require('./controllers/DepartmentController');
let swaggerJSDoc = require('swagger-jsdoc');
let app = express();
const PORT = 8080;

var swaggerDefinition = {
  info: {
    title: 'Employee Management App',
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

app.use(bodyParser.json());
app.use(cors());
app.use(express.static('public'));

new employeeController(app);
new departmentController(app);

app.listen(PORT, function callBack() {
    console.log(`Server Running at Port ${PORT}`);
});