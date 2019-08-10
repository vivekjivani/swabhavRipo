let service = require('../services/userService');

class UserController {
    constructor(app) {
        this._app = app;
        this.routeHandler();
    }

    routeHandler() {

        this._app.post('/api/v1/user/:id?/login', (req, res) => {
            service.getUserId(req.body.email)
                .then(
                    (result) => {
                        req.session.userId = result._id;
                        res.send(result);
                    }
                ).catch(
                    (err) => {
                        res.send(err);
                    }
                );
        });


        this._app.get('/api/v1/user:id?', (req, res) => {
            service.getUser(req.session.userId)
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