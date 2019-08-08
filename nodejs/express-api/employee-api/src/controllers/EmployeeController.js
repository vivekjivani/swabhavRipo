// let service = require('../services/EmployeeService');
let service = require('../services/EmployeeDBService');

/**
 * @swagger
 * tags:
 *   name: Employee
 *   description: employee management
 */
/**
 * @swagger
 * definitions:
 *   Employee:
 *     properties:
 *       EMPNO:
 *         type: integer
 *       ENAME:
 *         type: string
 *       JOB:
 *         type: string
 *       MGR:
 *         type: string
 *       HIREDATE:
 *         type: date
 *       SAL:
 *         type: integer
 *       COMM:
 *         type: integer
 */
class EmployeeController {
    constructor(app) {
        this.app = app;
        this.routeHandler();
    }
    routeHandler() {

         /**
         * @swagger
         * /api/v1/department/employee:
         *   get:
         *     tags:
         *       - Employee
         *     description: Returns all Employee
         *     produces:
         *       - application/json
         *     responses:
         *       200:
         *         description: An array of Departments
         *         schema:
         *           $ref: '#/definitions/Employee'
         */
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

        /**
         * @swagger
         * /api/v1/department/{id}/employee:
         *   post:
         *     tags: 
         *       - Employee
         *     description: return added employee
         *     parameters:
         *       - name: employee
         *         description: Employee object
         *         in: body
         *         required: true
         *         schema:
         *           $ref: '#/definitions/Employee'
         *     responses:
         *       '200':
         *         description: 'OK'
         *         schema:
         *           $ref: '#/definitions/Employee'
         */
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

        /**
        * @swagger
        * /api/v1/department/{dId}/employee/{eId}:
        *   get:
        *     description: get employee of specified id and return it
        *     tags: 
        *       - Employee
        *     parameters:
        *       - name: departmentId
        *         description: Department's id
        *         in: path
        *         required: true
        *         type: integer
        *       - name: employeeId
        *         description: Employee's id
        *         in: path
        *         required: true
        *         type: integer
        *     responses:
        *       200:
        *         description: json of single depatment data
        *         schema:
        *           $ref: '#/definitions/Employee'
        */
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

        /**
        * @swagger
        * /api/v1/department/{dId}/employee/{eId}:
        *   delete:
        *     description: delete employee of specified id and return it
        *     tags: 
        *       - Employee
        *     parameters:
        *       - name: departmentId
        *         description: Department's id
        *         in: path
        *         required: true
        *         type: integer
        *       - name: employeeId
        *         description: Employee's id
        *         in: path
        *         required: true
        *         type: integer
        *     responses:
        *       200:
        *         description: json of single depatment data
        *         schema:
        *           $ref: '#/definitions/Employee'
        */
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