let Contact = require('./Contact');
let service = require('./contactDBService');
let readlineSync = require('readline-sync');
let contact = new Contact();
let contactArray = [];

do {
    console.log('1. add Contact');
    console.log('2. display Contact');
    console.log('3. exit');
    var choice = readlineSync.question('Enter your choice : ');
    switch (choice) {
        case '1':
            userInput();
            service.addContact(contact);
            break;

        case '2':
            async function acyncCoverFunction() {
                data = await service.readData();
            };
            acyncCoverFunction();
            break;

        default:
            break;
    }
} while (choice < 3)

function userInput() {
    console.log('**Enter Contact**');
    let id = readlineSync.question('Id : ');
    let name = readlineSync.question('Name : ');
    let phone = readlineSync.question('Phone : ');
    contact.Id = id;
    contact.Name = name;
    contact.Phone = phone;
}