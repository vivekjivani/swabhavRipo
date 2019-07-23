let Events = require('events');
let fileSystem = require('fs');

class FileReader extends Events {

    constructor(fileName) {
        super();
        this.fileName = fileName;
    }

    read() {
        console.log('Start of Read...');
        var that = this;
        fileSystem.readFile(this.fileName, 'utf8', (error, content) => {
            if (error) {
                that.emit('error', 'from_read');
            } else {
                console.log('read success');
                that.emit('printData', content);
            }
        });
        console.log('End of Read...');
    }

    write(data) {
        console.log('Start of Write...');
        var that = this;
        fileSystem.writeFile(this.fileName, data, (error) => {
            if (error) {
                that.emit('error', 'from_write');
            } else {
                console.log('write success');

            }
        });
        console.log('End of Write...');
    }

}

module.exports = FileReader;