const userModel = require('../schemas/usersSchema');

class TaskService {
    constructor() {
    }

    addTask(userId, taskData) {
        return new Promise((resolve, reject) => {
            userModel.updateOne(
                { _id: userId },
                {
                    $push: {
                        Task: taskData
                    }
                }
            ).exec((error, response) => {
                if (error) {
                    reject(error);
                }
                resolve(response);
            });
        });
    }

    getAllTask(userId) {
        return new Promise((resolve, reject) => {
            let select = {
                _id: 0,
                Task: 1
            }
            userModel.find()
                .where('_id')
                .equals(userId)
                .select(select)
                .exec()
                .then(
                    (response) => {
                        let result = response[0].Task
                        resolve(result);
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                )
        });
    }

    getTaskById(userId, taskId) {
        return new Promise((resolve, reject) => {
            let select = {
                _id: 0,
                Task: 1
            }
            userModel.find()
                .where({ _id: userId, 'Task._id': taskId })
                .select(select)
                .exec()
                .then(
                    (response) => {
                        let result = response[0].Task
                        resolve(result);
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                )
        });
    }

    editTask(userId, taskId, taskData) {
        return new Promise((resolve, reject) => {
            userModel.updateOne(
                {
                    '_id': userId,
                    'Task._id': taskId
                },
                {
                    $set: {
                        'Task': taskData
                    }
                }
            )
                .exec()
                .then(
                    (response) => {
                        resolve(response);
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                )
        });
    }

    deleteTaskById(userId, taskId) {
        return new Promise((resolve, reject) => {
            userModel.remove({ _id: userId, 'Task._id': taskId }, (error) => {
                if (error) {
                    reject(error);
                }
                resolve('delete success');
            })
        });
    }
}

module.exports = new TaskService();