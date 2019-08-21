const service = require('../services/userService');

/**
 * @swagger
 * tags:
 *   name: UserController
 *   description: User management and login
 */

/**
 * @swagger
 * definitions:
 *      user:
 *          properties:
 *              firstName:
 *                  type: string
 *              lastName:
 *                  type: string
 *              gender:
 *                  type: string
 *              birthOfDate:
 *                  type: date
 *              contactNo:
 *                  type: number
 *              country:
 *                  type: string
 *              state:
 *                  type: string
 *              city:
 *                  type: string
 *              street:
 *                  type: string
 *              houseNumber:
 *                  type: string
 *              emailId:
 *                  type: string
 *              password:
 *                  type: string  
 *      userUpdate:
 *          properties:
 *              firstName:
 *                  type: string
 *              lastName:
 *                  type: string
 *              gender:
 *                  type: string
 *              birthOfDate:
 *                  type: date
 *              contactNo:
 *                  type: number
 *              country:
 *                  type: string
 *              state:
 *                  type: string
 *              city:
 *                  type: string
 *              street:
 *                  type: string
 *              houseNumber:
 *                  type: string
 *              emailId:
 *                  type: string      
 *      userLogin:
 *          properties:
 *              emailId:
 *                  type: string
 *              password:
 *                  type: string
 */

class UserController {
    constructor(app) {
        this._app = app;
        this.routeHandler();
    }

    routeHandler() {
        /**
         * @swagger
         * /api/v1/login:
         *   post:
         *     tags:
         *       - UserController
         *     description: Returns a user's id
         *     produces:
         *       - application/json
         *     parameters:
         *       - name: loginDTO
         *         description: emailId & password
         *         in: body
         *         required: true
         *         schema:
         *           $ref: '#/definitions/userLogin'
         *     responses:
         *       200:
         *         description: user's id
         */

        //login
        this._app.post('/api/v1/user/login', (req, res) => {
            let email = req.body.emailId;
            let password = req.body.password;
            service.getUserId(email, password)
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

        //logout
        this._app.post('/api/v1/user/:userId/logout', (req, res) => {
            let userId = req.params.userId;
            res.send('logout..');
        })

        /**
         * @swagger
         * /api/v1/user/{userId}:
         *   get:
         *     tags:
         *       - UserController
         *     description: Returns a single user
         *     produces:
         *       - application/json
         *     parameters:
         *       - name: userId
         *         description: user's id
         *         in: path
         *         required: true
         *     responses:
         *       200:
         *         description: A single User
         */
        // get user by Id
        this._app.get('/api/v1/user/:userId', (req, res) => {
            service.getUser(req.params.userId)
                .then(
                    (result) => {
                        res.send(result);
                    }
                ).catch(
                    (error) => {
                        res.send(error);
                    }
                );
        });


         /**
         * @swagger
         * /api/v1/register:
         *   post:
         *     tags:
         *       - UserController
         *     description: Creates a new Account
         *     produces:
         *       - application/json
         *     parameters:
         *       - name: user
         *         description: User object
         *         in: body
         *         required: true
         *         schema:
         *           $ref: '#/definitions/user'
         *     responses:
         *       200:
         *         description: Successfully created
         */

        // add user  {{ Addresss issue....... don't forget to fix }}
        this._app.post('/api/v1/user', (req, res) => {
            let user = req.body;
            service.registerUser(user)
                .then(
                    (result) => {
                        res.send(result);
                    }
                ).catch(
                    (error) => {
                        res.send(error);
                    }
                );
        });

        /**
         * @swagger
         * /api/v1/user/{userId}:
         *   put:
         *     tags:
         *       - UserController
         *     description: Update User
         *     produces:
         *       - application/json
         *     parameters:
         *       - name: userId
         *         description: user's id
         *         in: path
         *         required: true
         *       - name: user
         *         description: User object
         *         in: body
         *         required: true
         *         schema:
         *           $ref: '#/definitions/userUpdate'
         *     responses:
         *       200:
         *         description: Successfully updated
         */
        //edit user
        this._app.put('/api/v1/user/:userId', (req, res) => {
            let userData = req.body;
            let userId = req.params.userId;
            service.editUser(userData, userId)
                .then(
                    (result) => {
                        res.send(result);
                    }
                )
                .catch(
                    (error) => {
                        res.send(error);
                    }
                );
        });

        
        /**
         * @swagger
         * /api/v1/user/{userId}:
         *   delete:
         *     tags:
         *       - UserController
         *     description: Deletes a single user
         *     produces:
         *       - application/json
         *     parameters:
         *       - name: userId
         *         description: user's id
         *         in: path
         *         required: true
         *     responses:
         *       200:
         *         description: Successfully deleted
         */
        //deleteUSer
        this._app.delete('/api/v1/user/:userId/delete', (req, res) => {
            let userId = req.params.userId;
            service.deleteUser(userId)
                .then(
                    (result) => {
                        res.send(result);
                    }
                ).catch(
                    (error) => {
                        res.send(error);
                    }
                );
        });
    }
}

module.exports = UserController;

//rest API should be stateless

        // let authenticationMidware = function (req, res, next) {
        //     if (req.session && req.session.user) {
        //         next();
        //     } else {
        //         res.send('please, login first!!');
        //     }
        // }

           // req.session.reset();
