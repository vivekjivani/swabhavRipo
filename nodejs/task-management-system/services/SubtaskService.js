const userModel = require('../schemas/usersSchema');

class SubtaskService {
    constructor() {}

    addSubtask(userId, taskId, subtaskData) {
        return new Promise((resolve, reject) => {
            userModel.updateOne({
                _id: userId,
                'Task._id': taskId
            }, {
                $push: {
                    'Task.$.SubTask': subtaskData
                }
            }).exec((error, response) => {
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
                .where('_id')
                .equals(userId)
                .select(select)
                .exec()
                .then(
                    (response) => {
                        let task = response[0].Task
                        let subtask = task.forEach(element => {
                            if (element._id == taskId) {
                                console.log(element.SubTask);

                                resolve(element.SubTask);
                            }
                        });
                        // console.log(subtask);
                        // resolve(subtask);
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                )


            // let select = {
            //     _id: 0,
            //     Task: 1
            // }
            // userModel.findOne({ '_id': userId }, { task : { $elemMatch : { _id: taskId } } })
            //     .exec()
            //     .then(
            //         (response) => {
            //             let result = response.Task[0].SubTask;
            //             resolve(result);
            //             // resolve(response);
            //         }
            //     )
            //     .catch(
            //         (error) => {
            //             reject(error);
            //         }
            //     )
            // userModel.find()
            //     .where({ _id: userId, 'Task._id': taskId })
            //     .select(select)
            //     .exec()
            //     .then(
            //         (response) => {
            //             let result = response[0].Task[0].SubTask;
            //             resolve(result);
            //             // resolve(response);
            //         }
            //     )
            //     .catch(
            //         (error) => {
            //             reject(error);
            //         }
            //     )
        });
    }

    getSubTaskById(userId, taskId) {
        return new Promise((resolve, reject) => {
            let select = {
                _id: 0,
                Task: 1
            }
            userModel.find()
                .where({
                    _id: userId,
                    'Task._id': taskId
                })
                .select(select)
                .exec()
                .then(
                    (response) => {
                        let result = response[0].Task[0].Subtask;

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
            this.deleteSubtaskById(userId, taskId, subtaskId)
                .then(
                    () => {
                        this.addSubtask(userId, taskId, subtaskData)
                            .then(
                                () => {
                                    resolve('Data Updated..');
                                }
                            )
                            .catch(
                                (error) => {
                                    reject(error);
                                }
                            );
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                );
        });
    }

    deleteSubtaskById(userId, taskId, subtaskId) {
        return new Promise((resolve, reject) => {
            userModel.updateOne({
                _id: userId,
                'Task._id': taskId
            }, {
                $pull: {
                    'Task.$.SubTask': {
                        _id: subtaskId
                    }
                }
            }).exec((err, response) => {
                if (err) {
                    reject(err);
                }
                resolve(response);
            })
        });
    }
}
module.exports = new SubtaskService();