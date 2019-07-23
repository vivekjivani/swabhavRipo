let service = require('./contactService');

class Contact {

    constructor(id, name, phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        service.addContact(this);
    }

    get getName() {
        return this._name;
    }
    set setName(name) {
        this._name = name;
    }
    get getId() {
        return this._id;
    }

    set setId(id) {
        this._id = id;
    }
    get getPhone() {
        return this._phone;
    }
    set setPhone(phone) {
        this._phone = phone;
    }
}
module.exports = Contact;