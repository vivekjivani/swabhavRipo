let ContactService = require('../services/contactService');


/**
 * @swagger
 * tags:
 *   name: ContactController
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
         * /api/v1/contact:
         *   get:
         *     description: return contacts
         *     responses:
         *       200:
         *         description: json of contact
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
        /**
         * @swagger
         * /api/v1/contact:
         *   post:
         *     description: create contacts
         *     parameter:
         *  
         *     responses:
         *       200:
         *         description: add a new contact to repository
         */
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
        /**
         * @swagger
         * /api/v1/contact:
         *   delete:
         *     description: create contacts
         *     responses:
         *       200:
         *         description: add a new contact to repository
         */
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