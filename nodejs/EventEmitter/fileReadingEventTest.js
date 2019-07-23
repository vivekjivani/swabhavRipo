var FileReader = require('./fileReadingEvent');

FileReader = new FileReader('./textfile.txt');

FileReader.on('error', function (error) {
    console.log('error event emited....');
    console.log('error ' + error);
});

FileReader.on('printData', function (content) {
    console.log('printData Event Emitted');
    console.log('Data : ' + content);
});

FileReader.read();

FileReader.write('Hello good morning..');

FileReader.read();
