const userModel = require('../schemas/usersSchema');

class SubtaskService {
    constructor() {
    }

    addSubtask(userId, taskId, subtaskData) {
        return new Promise((resolve, reject) => {
            userModel.updateOne(
                { _id: userId, 'Task._id': taskId },
                {
                    $push: {
                        'Task.$.SubTask': subtaskData
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

    getAllSubtask(userId, taskId) {
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
                        let result = response[0].Task[0].SubTask;
                        resolve(result);
                        // resolve(response);
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

    editTask(userId, taskId, subtaskId, subtaskData) {
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
                        let result = response[0].Task[0].SubTask;
                        result.forEach(element => {
                            if (element._id == subtaskId) {

                                resolve(element);
                                // return element;
                            }
                        });
                        reject('subtask not found');
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                );
        });
    }

    // deleteTaskById(userId, taskId) {
    //     return new Promise((resolve, reject) => {
    //         userModel.remove({ _id: userId, 'Task._id': taskId }, (error) => {
    //             if (error) {
    //                 reject(error);
    //             }
    //             resolve('delete success');
    //         })
    //     });
    // }
}

module.exports = new SubtaskService();