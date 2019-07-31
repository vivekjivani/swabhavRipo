let sql = require(sql);
//let Contact = require(Contact);

class ContactService {
    constructor() {
        this.contactList = [];
        this.conn = mysql.createConnection({
            host: "localhost",
            user: "root",
            password: "root",
            database: "swabhav"
        });
    }

    addContact(contact) {
        this.conn.connect(function (err){
            if(err){
                throw err;
            }
            console.log('Connected...');

            let sql = "INSERT INTO CONTACT VALUES ?";
            let values = [contact._id, contact._name, conatct._phone];

            conn.query(sql, [values], function (err, result) {
                if (err) throw err;
                console.log("Query Executed..");
                console.log(result);
            });
        
        })
        // let rawdata = fs.readFileSync('contact.json');
        // this.contactList = JSON.parse(rawdata);
        // this.contactList.push(contact);
        // let data = JSON.stringify(this.contactList);
        // fs.writeFileSync('./contact.json', data, 'utf8');
        // console.log('contact added');
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