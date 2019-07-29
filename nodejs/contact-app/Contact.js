let service = require('./contactService');

class Contact {

    constructor(id, name, phone) {
        this._id = id;
        this._name = name;
        this._phone = phone;
        //service.addContact(this);
    }

    get Name() {
        return this._name;
    }
    set setName(name) {
        this.name = name;
    }
    get getId() {
        return this.id;
    }

    set Id(id) {
        this._id = id;
    }
    get getPhone() {
        return this.phone;
    }
    set setPhone(phone) {
        this.phone = phone;
    }
}
module.exports = Contact;