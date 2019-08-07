// let service = require('../services/EmployeeService');
let service = require('../services/EmployeeDBService');

/**
 * @swagger
 * tags:
 *   name: EmployeeController
 *   description: employee management
 */
class EmployeeController {
    constructor(app) {
        this.app = app;
        this.routeHandler();
    }
    routeHandler() {
        this.app.get('/api/v1/department/employee', (req, res) => {
            service.getAllEmployee()
                .then(
                    (result) => {
                        res.send(result);
                    }
                )
                .catch(
                    (err) => {
                        console.log(err);
                        res.send(err);
                    }
                );
        });

        this.app.post('/api/v1/department/:id/employee', (req, res) => {
            service.addEmployee(req.params.id, req.body)
                .then(
                    (result) => {
                        res.send(result);
                    }
                )
                .catch(
                    (err) => {
                        console.log(err);
                        res.send(err);
                    }
                );
        });

        this.app.get('/api/v1/department/:dId/employee/:eId', (req, res) => {
            service.getEmployeeById(req.params.dId, req.params.eId)
                .then(
                    (result) => {
                        res.send(result);
                    }
                ).catch(
                    (err) => {
                        res.send(err);
                    }
                );
        });

        this.app.delete('/api/v1/department/:dId/employee/:eId', (req, res) => {
            service.deleteEmployeeById(req.params.dId, req.params.eId)
                .then(
                    (result) => {
                        res.send(result);
                    }
                )
                .catch(
                    (err) => {
                        res.send(err);
                    }
                );
        });
    }
}
module.exports = EmployeeController;