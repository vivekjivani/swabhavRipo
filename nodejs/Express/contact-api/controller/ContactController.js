let App = require('../app');
let Service = require('../service/contactService');
let Contact = require('../model/Contact');


App.get('/swagger.json', function (req, res) {
    res.setHeader('Content-Type', 'application/json');
    res.send(swaggerSpec);
});

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