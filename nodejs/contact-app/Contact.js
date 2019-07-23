let service = require('./contactService');

class Contact {

    constructor(id, name, phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        //service.addContact(this);
    }

    get getName() {
        return this.name;
    }
    set setName(name) {
        this.name = name;
    }
    get getId() {
        return this.id;
    }

    set setId(id) {
        this.id = id;
    }
    get getPhone() {
        return this.phone;
    }
    set setPhone(phone) {
        this.phone = phone;
    }
}
module.exports = Contact;