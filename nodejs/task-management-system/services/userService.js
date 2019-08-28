const userModel = require('../schemas/usersSchema');

class UserService {
    constructor() {}

    getUserId(email, password) {
        return new Promise((resolve, reject) => {
            userModel
                .findOne({
                    emailId: email,
                    password: password
                })
                .select({
                    _id: 1
                })
                .exec((error, userId) => {
                    if (error) {
                        reject(error);
                    } else if (!userId) {
                        reject('User not found.');
                    }
                    resolve(userId);
                })
        });
    }

    registerUser(userData) {
        return new Promise((resolve, reject) => {
            userModel.findOne({
                    isDelete: false,
                    emailId: userData.emailId
                })
                .exec((error, response) => {
                    if (error) {
                        reject(error);
                    }
                    if (response) {
                        resolve("emailId Already registered");
                    }
                    if (!error && !response) {
                        let user = new userModel(userData);
                        user.save()
                            .then(
                                (result) => {
                                    resolve("user registered.");
                                }
                            )
                            .catch(
                                (error) => {
                                    reject(error);
                                }
                            );
                    }
                });
        });
    }

    getUser(id) {
        return new Promise((resolve, reject) => {
            let select = {
                _id: 0,
                userName: 1,
                address: 1,
                birthDate: 1,
                emailId: 1,
                phone: 1
            };
            userModel
                .find({
                    isDelete: false
                })
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

    editUser(userData, userId) {
        return new Promise((resolve, reject) => {
            userModel.updateOne({
                _id: userId
            }, {
                $set: {
                    userName: userData.userName,
                    gender: userData.gender,
                    address: userData.address,
                    phone: userData.phone,
                    emailId: userData.emailId
                }
            }).exec((error, response) => {
                if (error) {
                    reject(error);
                }
                resolve(response);
            });
        });
    }

    deleteUser(userId) {
        return new Promise((resolve, reject) => {
            userModel.updateOne({
                _id: userId
            }, {
                $set: {
                    isDelete: true
                }
            }).exec((error, response) => {
                if (error) {
                    reject(error);
                }
                resolve(response);
            });
        });
    }
}

module.exports = new UserService();