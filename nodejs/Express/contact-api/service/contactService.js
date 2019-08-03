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
        this.writeData(data);
        console.log('contact added');
    }

    writeData(data) {
        fs.writeFileSync('./contact.json', data, 'utf8');
    }

    readData(){
        return new Promise((resolve, reject) => {
            fs.readFile('contact.json', (error, data) => {
                if (data) {
                    resolve(JSON.parse(data));
                }
                reject(error);
            })
        })
    }

    deleteContact(id) {
        this.readData().then(
            (data) => {
                this.contactList = data;
                let indexToRemove = this.getElementToDelete(id);
                this.contactList.splice(indexToRemove, 1);
                console.log(this.contactList);
                this.writeData(JSON.stringify(this.contactList));
            }
        );
    }

    getElementToDelete(id) {
        for (let index = 0; index < this.contactList.length; index++) {
            const element = this.contactList[index];
            if (element.id == id) {
                //console.log(element);
                return index;
            }
        }
    }

    printData() {
        console.log(this.contactList);
    }
}

let service = new ContactService();
module.exports = service;