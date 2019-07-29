let FileSystem = require('fs');
console.log(__dirname)
let http = require('http');
let server = http.createServer((req, res) => {
    console.log(req.url)
    let fileName = req.url.slice(1);
    FileSystem.readFile(fileName, (error, data) => {
        if (data) {
            res.write( data.toString() );
            res.end();
        } else {
            res.write('<html><body><div style="border:1px solid black;"><p>404: Page Not Found</p></div></body></html>');
            res.end();
        }
    })
});
server.listen(8080,()=>{
    console.log("server started at 8080")
});