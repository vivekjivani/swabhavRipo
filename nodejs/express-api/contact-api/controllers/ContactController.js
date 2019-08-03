let ContactService = require('../services/contactService');


/**
 * @swagger
 * definitions:
 *   Login:
 *     required:
 *       - username
 *       - password
 *     properties:
 *       username:
 *         type: string
 *       password:
 *         type: string
 *       path:
 *         type: string
 */

/**
 * @swagger
 * tags:
 *   name: Users
 *   description: conatct management
 */
class ContactController {
    constructor(app) {
        this.app = app;
        this.routeHandler();
    }

    routeHandler() {
        /**
   * @swagger
   * /hello:
   *   get:
   *     description: Returns the homepage
   *     responses:
   *       200:
   *         description: hello world
   */
        this.app.get('/api/v1/contact', (req, res) => {
            ContactService.readData()
                .then(
                    (result) => {
                        res.send(result);
                    }
                )
                .catch(
                    (error) => {
                        // console.log(error);
                        res.send(error);
                    }
                );
        });

        this.app.post('/api/v1/contact', (req, res) => {
            ContactService.addContact(req.body)
                .then(
                    (result) => {
                        res.send(result);
                    }
                ).catch(
                    (error) => {
                        console.log(error);
                        res.send(error);
                    }
                );
        });

        this.app.delete('/api/v1/contact', (req, res) => {
            ContactService.deleteContact(req.param.id)
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

module.exports = ContactController;