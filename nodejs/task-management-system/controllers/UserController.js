let service = require('../services/userService');

class UserController {
    constructor(app) {
        this._app = app;
        this.routeHandler();
    }

    routeHandler() {
        
        let authenticationMidware = function (req, res, next) {
            if (req.session && req.session.user) {
                next();
            } else {
                res.send('please, firt login needed!!');
            }
        }

        this._app.post('/api/v1/user/:id?/login', (req, res) => {
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


        this._app.get('/api/v1/user:id?', authenticationMidware,(req, res) => {
            service.getUser(req.session.user)
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
            service.addUser(user)
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