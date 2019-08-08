// let service = require('../services/EmployeeService');
let service = require('../services/EmployeeDBService');

/**
 * @swagger
 * tags: 
 *   name: Department
 *   description: department management
 */
/**
 * @swagger
 * definitions:
 *   Department:
 *     properties:
 *       DEPTNO:
 *         type: integer
 *       DNAME:
 *         type: string
 *       LOC:
 *         type: string
 */
class DepartmentController {
    constructor(app) {
        this.app = app;
        this.routeHandler();
    }

    routeHandler() {

        /**
         * @swagger
         * /api/v1/department:
         *   get:
         *     tags:
         *       - Department
         *     description: Returns all Department
         *     produces:
         *       - application/json
         *     responses:
         *       200:
         *         description: An array of Departments
         *         schema:
         *           $ref: '#/definitions/Department'
         */
        this.app.get('/api/v1/department', (req, res) => {
            service.getAllDepartment()
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

        /**
         * @swagger
         * /api/v1/department:
         *   post:
         *     tags: 
         *       - Department
         *     description: return added department
         *     parameters:
         *       - name: department
         *         description: department object
         *         in: body
         *         required: true
         *         schema:
         *           $ref: '#/definitions/Department'
         *     responses:
         *       200:
         *         description: return all department
         *         schema:
         *           $ref: '#/definitions/Department'
         */
        this.app.post('/api/v1/department', (req, res) => {
            // res.send(req.body);
            service.addDepartment(req.body)
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
         * /api/v1/department/{id}:
         *   get:
         *     tags:
         *       - Department
         *     description: Returns a single Department
         *     produces:
         *       - application/json
         *     parameters:
         *       - name: id
         *         description: Department's id
         *         in: path
         *         required: true
         *         type: integer
         *     responses:
         *       200:
         *         description: A single department
         *         schema:
         *           $ref: '#/definitions/Department'
         */
        this.app.get('/api/v1/department/:id', (req, res) => {
            service.getDepartmentById(req.params.id)
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

        /**
         * @swagger
         * /api/v1/department/{id}/employee:
         *   get:
         *     tags:
         *       - Department
         *     description: Returns a single Department's all employees
         *     produces:
         *       - application/json
         *     parameters:
         *       - name: id
         *         description: Department's id
         *         in: path
         *         required: true
         *         type: integer
         *     responses:
         *       200:
         *         description: Array of employees
         *         schema:
         *           $ref: '#/definitions/Department'
         */
        this.app.get('/api/v1/department/:id/employee', (req, res) => {
            service.getEmployeeInDepartment(req.params.id)
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
        * /api/v1/department/{id}:
        *   delete:
        *     description: delete department of specified id and return it
        *     tags: 
        *       - Department
        *     parameters:
        *       - name: id
        *         description: Department's id
        *         in: path
        *         required: true
        *         type: integer
        *     responses:
        *       200:
        *         description: A single puppy
        *         schema:
        *           $ref: '#/definitions/Department'
        */
        this.app.delete('/api/v1/department/:id', (req, res) => {
            service.deleteDepartmentById(req.params.id)
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

module.exports = DepartmentController;