let App = require('../app');
let Service = require('../service/contactService');
let Contact = require('../model/Contact');

/**
 * @swagger
 *
 * /login:
 *   post:
 *     description: Login to the application
 *     produces:
 *       - application/json
 *     parameters:
 *       - name: username
 *         description: Username to use for login.
 *         in: formData
 *         required: true
 *         type: string
 *       - name: password
 *         description: User's password.
 *         in: formData
 *         required: true
 *         type: string
 *     responses:
 *       200:
 *         description: login
 */
App.get('/api/v1/contacts', (req, res) => {
    Service.readData().then(
        (data) => {
            res.send(data);
        }
    ).catch(
        (error) => {
            res.end(() => {
                console.log(error);
            });
        }
    );
});

App.post('/api/v1/contacts', (req, res) => {
    console.log(req.body);
    console.log(Service.addContact(req.body));
});

App.delete('/api/v1/contacts/:id', (req, res) => {
    console.log(req.params.id);
    Service.deleteContact(req.params.id);
});

App.listen(8080, () => {
    console.log('Server Running at port number : 8080');
});