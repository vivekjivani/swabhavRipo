const mongoose = require('mongoose');
// const usersSchema = require('../schemas/usersSchema');
const uri = 'mongodb+srv://admin:root@cluster0-sjbot.mongodb.net/task_managemnet_system?retryWrites=true&w=majority'
const userModel = require('../schemas/usersSchema');

class UserService {
    constructor() {
        this._connect();
    }

    _connect() {
        mongoose.connect(uri, { useNewUrlParser: true });
        let connection = mongoose.connection;
        connection.on('connected', () => {
            console.log('db connected');
        });

        connection.on('error', (error) => {
            console.log(error);
        });
    }

    getUserId(email) {
        return new Promise((resolve, response) => {
            userModel
                .findOne({ emailId: email })
                .select({ _id: 1 })
                .exec((error, user) => {
                    if (error) {
                        reject(error);
                    } else if (!user) {
                        reject('User not found.');
                    }
                    resolve(user);
                })
        });
    }

    getUser(id) {
        return new Promise((resolve, reject) => {
            let select = {
                _id: 0,
                userName: 1,
                gender: 1,
                birthdate: 1,
                phone: 1,
                emailId: 1,
                address: 1
            };
            userModel
                .find()
                .where('_id')
                .equals(id)
                .select(select)
                .exec((error, response) => {
                    if (error) {
                        reject(error);
                    }
                    resolve(response);
                })
        });
    }
}

module.exports = new UserService();





