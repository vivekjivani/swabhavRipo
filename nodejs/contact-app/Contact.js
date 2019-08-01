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
    set Name(name) {
        this._name = name;
    }
    get Id() {
        return this._id;
    }

    set Id(id) {
        this._id = id;
    }
    get Phone() {
        return this._phone;
    }
    set Phone(phone) {
        this._phone = phone;
    }
}
module.exports = Contact;