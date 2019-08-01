let sql = require('mysql');

class ContactService {
    constructor() {
        this.contactList = [];
        this.conn = sql.createConnection({
            host: "localhost",
            user: "root",
            password: "root",
            database: "swabhav"
        });
    }

    addContact(contact) {
        let sql = "INSERT INTO CONTACT VALUES ?";
        let values = [[contact._id, contact._name, contact._phone]];
        this.conn.query(sql, [values], function (err, result) {
            if (err) throw err;
            console.log("Query Executed..");
            console.log("Contact Added");
        });
    }

    readData() {
        let sql = "SELECT * FROM Contact";
        this.conn.query(sql, function (err, result) {
            if (err) throw err;
            console.log("Query Executed..");
            console.log(result);
        });
    }

    printData() {
        console.log(this.contactList);
    }
}

let service = new ContactService();
module.exports = service;