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
            userModel.findOne({ _id: userId, 'Task._id': taskId }, { Task: { $elemMatch: { _id: taskId } } })
                .select({
                    _id: 0,
                    'Task._id': 0,
                })
                .exec()
                .then(
                    (response) => {
                        resolve(response.Task);
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                )
        });
    }

    editTask(taskId, taskData) {
        return new Promise((resolve, reject) => {
            userModel.updateOne(
                {
                    Task: { $elemMatch: { _id: taskId } }
                },
                {
                    $set: {
                        'Task.$.title': taskData.title,
                        'Task.$.description': taskData.description,
                        'Task.$.startDate': taskData.startDate,
                        'Task.$.dueDate': taskData.dueDate,
                        'Task.$.assignee': taskData.assignee,
                        'Task.$.priority': taskData.priority,
                        'Task.$.tags': taskData.tags,
                        'Task.$.isCompleted': taskData.isCompleted
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
            userModel.updateOne(
                { '_id': userId, 'Task._id': taskId }, { $pull: { Task: { '_id': taskId } } })
                .exec()
                .then(
                    (response) => {
                        resolve(response);
                        // resolve('delete success');
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                );
        })
    }
}

module.exports = new TaskService();