let Contact = require('./Contact');
let service = require('./contactService');
let readlineSync = require('readline-sync');
let contact = new Contact();
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
            async function main() {
                console.log('before read');
                let data = await service.readData();
                console.log(data);
                console.log('after read');                
            };
            main();
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
    contact.setId = id;
    contact.setName = name;
    contact.setPhone = phone;
}