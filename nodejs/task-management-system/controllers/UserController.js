let service = require('../services/userService');

class UserController {
    constructor(app) {
        this._app = app;
        this.routeHandler();
    }

    routeHandler() {

        //login
        this._app.post('/api/v1/user/login', (req, res) => {
            let email = req.body.emailId;
            service.getUserId(email)
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
        this._app.post('/api/v1/user/logout', (req, res) => {
            res.send('logout..');
        })

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

        // add user
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
        })
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
