let Events = require('events');
let fileSystem = require('fs');

class FileReader extends Events {

    constructor(fileName) {
        super();
        this.fileName = fileName;
    }
    
    read() {
        console.log('Start of Read...');
        this.fileContent = fileSystem.readFileSync(this.fileName, 'utf8');
        this.emit('printData', this.fileContent);
        console.log('End of Read');
    }

    write(data) {
        console.log('Start of Write...');
        fileSystem.writeFileSync(this.fileName, data);
        console.log('End of write');
    }
}

module.exports = FileReader;