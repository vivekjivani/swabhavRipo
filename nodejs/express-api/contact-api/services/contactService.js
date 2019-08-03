let fs = require('fs');
class ContactService {
    constructor() {
        this.contactList = [];
        this.data = [];
    }

    addContact(contact) {
        return new Promise((resolve, reject) => {

            this.readData()
                .then(
                    (result) => {
                        this.contactList = JSON.parse(result);
                        this.contactList.push(contact);
                        let data = JSON.stringify(this.contactList);
                        this.writeData(data);
                        resolve('success');
                    }
                ).catch(
                    (error) => {
                        reject('error');
                    }
                );
        });
    }

    writeData(data) {
        fs.writeFileSync('./repository/contact.json', data, 'utf8');
    }

    readData() {
        return new Promise((resolve, reject) => {
            fs.readFile('./repository/contact.json', (error, data) => {
                if (data) {
                    resolve(data);
                }
                reject(error);
            })
        })
    }

    deleteContact(id) {
        return new Promise((resolve, reject)=>{
            this.readData().then(
                (data) => {
                    this.contactList = JSON.parse(data);
                    let indexToRemove = this.getElementToDelete(id);
                    this.contactList.splice(indexToRemove, 1);
                    this.writeData(JSON.stringify(this.contactList));
                    resolve('success');
                }
            ).catch(
               (error)=>{
                    rejecct('failed');
               }
            );
        });
    }

    getElementToDelete(id) {
        for (let index = 0; index < this.contactList.length; index++) {
            const element = this.contactList[index];
            if (element.id == id) {
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