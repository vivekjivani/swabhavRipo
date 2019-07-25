let fs = require('fs');
class ContactService {
    constructor() {
        this.contactList = [];
    }

    addContact(contact) {
        let rawdata = fs.readFileSync('contact.json');
        this.contactList = JSON.parse(rawdata);
        this.contactList.push(contact);
        let data = JSON.stringify(this.contactList);
        fs.writeFileSync('./contact.json', data, 'utf8');
        console.log('contact added');
    }

    readData() {
        return new Promise((resolve, reject) => {
            fs.readFile('contact.json', (error, data) => {
                if (data) {
                    resolve(JSON.parse(data));
                }
                reject(error);
            })
        })
    }

    printData() {
        console.log(this.contactList);
    }
}

let service = new ContactService();
module.exports = service;