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
    // readData() {
    //     return new Promise((resolve, reject) => {
    //         fs.readFile('contact.json', (error, data) => {
    //             if (error) {
    //                 console.log(error);
    //                 reject(error);
    //             }
    //             this.contactList = JSON.parse(data);
    //             resolve(this.contactList);
    //         })
    //     });
    // }
    // readData() {
    //     let rawdata = fs.readFileSync('contact.json');
    //     this.contactList = JSON.parse(rawdata);
    //     this.printData();
    // }
    async read(){
        fs.readFile('contact.json', (error, data)=>{
            if(error){
                console.log(error);
            }else{
                this.contactList = JSON.parse(data);
                //return this.contactList;                
                this.printData();
            }
        });
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