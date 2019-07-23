const fileSystem = require('fs');
const fileName = './textfile.txt';

fileSystem.watchFile(fileName, (curr, prev) => {
    console.log('file is changed');
});
