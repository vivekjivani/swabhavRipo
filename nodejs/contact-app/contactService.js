//let contact = require('./Contact');
let fs = require('fs');
class ContactService {
    constructor() {
        this.contactList = [];
    }
    addContact(contact) {
        this.contactList.push(contact);
        let data = JSON.stringify(this.contactList);
        fs.writeFileSync('./contact.json', data);
        console.log('contact added');
    }
    displayContact() {
        fs.readFile('contact.json', (error, data) => {
            if (error) {
                console.log(error);
                throw error;
            }
            this.contactList = JSON.parse(data);
            console.log(this.contactList);
        });
    }
}

let service = new ContactService();
module.exports = service;