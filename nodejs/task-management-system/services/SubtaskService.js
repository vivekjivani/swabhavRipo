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

    getSubTaskById(userId, taskId) {
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
            let select = {
                _id: 0,
                Task: 1
            }

            userModel.find()
                .where({ _id: userId })
                .select(select)
                .exec()
                .then(
                    (response) => {
                        // let result = response[0].Task[0].SubTask;
                        // for (let index = 0; index < result.length; index++) {
                        //     if (result[index]._id == subtaskId) {
                        //         result[index] = subtaskData;
                        //     }
                        // }
                        // let user = new userModel(result);
                        // user.save()
                        //     .then(
                        //         (response) => {
                        //             resolve(response);
                        //         }
                        //     )
                        //     .catch(
                        //         (error) => {
                        //             reject(error);
                        //         }
                        //     );
                        // let result = response[0].Task
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

    deleteSubtaskById(userId, taskId, subtaskId) {
        return new Promise((resolve, reject) => {

            userModel.updateOne();

            // userModel.find()
            //     .where({ 'Task.SubTask': { $elemMatch: { _id: subtaskId } } })
            //     .select({
            //         'Task.SubTask' : 1
            //     })
            //     .exec()
            //     .then(
            //         (response) => {
            //             resolve(response);
            //         }
            //     )
            //     .catch(
            //         (error) => {
            //             reject(error);
            //         }
            //     );

            // userModel.remove(
            //     {
            //         _id: userId,
            //         'Task.$.SubTask': { $elemMatch : { _id : subtaskId } }
            //     }, (error) => {
            //         if (error) {
            //             reject(error);
            //         }
            //         resolve('delete success');
            //     })
        });
    }
}
module.exports = new SubtaskService();

// result.forEach(element => {
                        //     if (element._id == subtaskId) {

                        //     }
                        //     // resolve(element);
                        // });

                        // resolve(result);


  // userModel
            //     .find({ "Task._id": taskId })
            //     .forEach(function (model) {
            //         if (Task.SubTask) {
            //             Task.SubTask.forEach(function (SubTask) {
            //                 if (SubTask) {
            //                     console.log(SubTask);
            //                     // answer.comments.forEach(function (comment) {
            //                     //     if (comment.name === "jeff") {
            //                     //         comment.name = "joe";
            //                     //     }
            //                     // });
            //                 }
            //             });

            //             db.post.save(post);
            //         }
            //     });
            //     userModel.updateOne(
            //         {
            //             'Task.$.SubTask': { $elemMatch: { _id: subtaskId } }
            //         },
            //         {
            //             $set: {
            //                 'Task.$.SubTask.$.title': subtaskData.title
            //             }
            //         }
            //     )
            //         .exec()
            //         .then(
            //             (response) => {
            //                 resolve(response);
            //             }
            //         )
            //         .catch(
            //             (error) => {
            //                 reject(error);
            //             }
            //         );
            // });