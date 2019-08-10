let service = require('../services/userService');

class UserController {
    constructor(app) {
        this._app = app;
        this.routeHandler();
    }

    routeHandler() {
        this._app.post('/api/v1/user/login', (req, res) => {
            service.getUserId(req.body.email)
                .then(
                    (result) => {
                        req.session.user = result._id;
                        res.send(result);
                    }
                ).catch(
                    (err) => {
                        res.send(err);
                    }
                );
        });

        this._app.post('/api/v1/user/logout', (req, res) => {
            res.send('logout..');
        })

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
