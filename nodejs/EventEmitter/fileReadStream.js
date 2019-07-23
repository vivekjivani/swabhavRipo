let Events = require('events');
let fileSystem = require('fs');
let readerStream;
// let writerStream;
class FileReader extends Events {

    constructor(fileName) {
        super();
        this.data= '';
        readerStream = fileSystem.createReadStream(fileName);
        // writerStream = fileSystem.createWriteStream(fileName);
    }

    read() {
        console.log('Start of Read...');
        readerStream.on('data', (chunk) => {
            this.data += chunk;
        })
        readerStream.on('end', () => {
            console.log(this.data);
        })

        readerStream.on('error', (err) => {
            console.log(err.stack)
        })
        console.log('End of Read...');
    }

    // write(data) {
    //     console.log('Start of Write...');
    //     writerStream.write(data, 'UTF8')

    //     writerStream.end()

    //     writerStream.on('finish', function () {
    //         console.log('Writing completed');
    //     })

    //     writerStream.on('error', function (err) {
    //         console.log(err.stack)
    //     })
    //     console.log('End of Write...');
    // }
}

module.exports = FileReader;