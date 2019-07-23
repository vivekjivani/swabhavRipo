//let contact = require('./Contact');
// let Q = require('q');
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
    readData() {
        let rawdata = fs.readFileSync('contact.json');
        this.contactList = JSON.parse(rawdata);
        this.printData();
    }
    printData() {
        console.log(this.contactList);

    }
}

let service = new ContactService();
module.exports = service;



        // return new Promise( (resolve, reject) => {
        //     fs.readFileSync('contact.json', (error, data) => {
        //         if (error) {
        //             console.log(error);
        //            reject(error);
        //         }
        //         this.contactList = JSON.parse(data);
        //         resolve(this.contactList);
        //     })
        // } );