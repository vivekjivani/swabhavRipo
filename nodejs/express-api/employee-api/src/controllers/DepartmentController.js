// let service = require('../services/EmployeeService');
let service = require('../services/EmployeeDBService');

/**
 * @swagger
 * tags:
 *   name: DepartmentController
 *   description: department management
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
         *     description: return department data
         *     responses:
         *       200:
         *         description: json of department data
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
         *     description: return added department
         *     requestBody:
         *      content:
         *          application/json:
         *              schema:
         *                type: object
         *                properties:
         *                    DEPTNO:
         *                         type: integer
         *                    DNAME:
         *                         type: string
         *                    LOC:
         *                         type: string
         *              example:
         *                  DEPTNO: 10
         *                  DNAME: ACCOUNTING
         *                  LOC: CANADA
         *     responses:
         *       '200':
         *         description: 'OK'
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
         * paths:
         *  /api/v1/department/{id}:
         *   get:
         *     description: return department data of specified Id
         *     parameters:
         *          - in: path
         *            name: deptId
         *            schema:
         *              type : integer
         *            require: true
         *            description: Numeric ID of the user to get
         *     responses:
         *       200:
         *         description: json of single department
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
         *     description: return employee data from department of specified Id
         *     responses:
         *       200:
         *         description: json of employee data
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
        *     responses:
        *       200:
        *         description: json of single depatment data
        */
        // this.app.delete('/api/v1/department/:id', (req, res) => {
        //     service.deleteDepartmentById(req.params.id)
        //         .then(
        //             (result) => {
        //                 res.send(result);
        //             }
        //         )
        //         .catch(
        //             (err) => {
        //                 res.send(err);
        //             }
        //         );
        // });

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