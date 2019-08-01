let Express = require('express');
let router = Express.Router();
let app = Express();

app.use(Express.static('public'));

function compressionMidware(req, res, next) {
    console.log('inside Compression Middleware');
    next();
}

function encryptionMidware(req, res, next){
    console.log('inside Encryption Middleware');
    next();
}

function authonticationMidware(res, req, next){
    console.log('inside Authentication Middleware');
    next();
}

app.use('/login', compressionMidware, encryptionMidware, authonticationMidware);

app.get('/login', (req, res, next)=>{
    console.log('inside Login Controller');
    res.end();
});


app.listen(3000, ()=>{
    console.log('Server is running at port : localhost:3000');
});