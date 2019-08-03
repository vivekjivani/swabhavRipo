let GetContactController = require('../controllers/GetContactController');
let PostContactController = require('../controllers/PostContactController');
let DeleteConatctController = require('../controllers/DeleteContactController');
class ContactRoutes {
    constructor(app){
        this.app= app;
        this.routeToController();
    }

    routeToController(){
        this.app.get('/api/v1/contact', (req, res)=>{
           new GetContactController(req, res);
        });
        this.app.post('/api/v1/contact', (req, res)=>{
            new PostContactController(req, res);
        });
        this.app.delete('/api/v1/contact', (req, res)=>{
            new DeleteConatctController(req, res);
        });
    }
}

module.exports = ContactRoutes;