const service = require('../services/SubtaskService');

/**
 * @swagger
 * tags:
 *   name: SubTaskController
 *   description: Sub Task management
 */

/**
 * @swagger
 * definitions:
 *      subTask:
 *          properties:
 *              title:
 *                  type: string
 *              description:
 *                  type: string
 *              startDate:
 *                  type: date
 *              dueDate:
 *                  type: date
 *              assignee:
 *                  type: string
 *      subTaskUpdate:
 *          properties:
 *              title:
 *                  type: string
 *              description:
 *                  type: string
 *              startDate:
 *                  type: date
 *              dueDate:
 *                  type: date
 *              assignee:
 *                  type: string
 *              isComplated:
 *                  type: boolean
 */
class SubtaskController {
    constructor(app) {
        this._app = app;
        this.routeHandler();
    }

    routeHandler() {

        /**
         * @swagger
         *  /api/v1/user/{userId}/tasks/{taskId}/subTask:
         *   get:
         *     tags:
         *       - SubTaskController
         *     description: Returns all sub tasks of task
         *     produces:
         *       - application/json
         *     parameters:
         *       - name: userId
         *         description: User's id
         *         in: path
         *         required: true
         *       - name: taskId
         *         description: Task's id
         *         in: path
         *         required: true
         *     responses:
         *       200:
         *         description: An array of sub task of task
         */
        //get all subtask
        this._app.get('/api/v1/user/:userId/tasks/:taskId/subtask', (req, res) => {
            let userId = req.params.userId;
            let taskId = req.params.taskId;
            service.getAllSubtask(userId, taskId)
                .then(
                    (result) => {
                        res.send(result);
                    }
                ).catch(
                    (error) => {
                        res.send(error);
                    }
                );
        });

        /**
         * @swagger
         * /api/v1/user/{userId}/tasks/{taskId}/subTask:
         *   post:
         *     tags:
         *       - SubTaskController
         *     description: Creates a new Sub Task of Task
         *     produces:
         *       - application/json
         *     parameters: 
         *       - name: userId
         *         description: User's id
         *         in: path
         *         required: true
         *       - name: taskId
         *         description: Task's id
         *         in: path
         *         required: true
         *       - name: subTask
         *         description: SubTask object
         *         in: body
         *         required: true
         *         schema:
         *           $ref: '#/definitions/subTask'
         *     responses:
         *       200:
         *         description: Successfully Add Sub Task
         */
        //add subtask
        this._app.post('/api/v1/user/:userId/tasks/:taskId/subTask', (req, res) => {
            let userId = req.params.userId;
            let taskId = req.params.taskId;
            let subtaskData = req.body;
            service.addSubtask(userId, taskId, subtaskData)
                .then(
                    (result) => {
                        res.send(result);
                    }
                ).catch(
                    (error) => {
                        res.send(error);
                    }
                );
        });

        /**
         * @swagger
         * /api/v1/user/{userId}/tasks/{taskId}/subTask/{subTaskId}:
         *   put:
         *     tags:
         *       - SubTaskController
         *     description: Update a sub Task of User
         *     produces:
         *       - application/json
         *     parameters: 
         *       - name: userId
         *         description: User's id
         *         in: path
         *         required: true
         *       - name: taskId
         *         description: Task's id
         *         in: path
         *         required: true
         *       - name: subTaskId
         *         description: Sub Task's id
         *         in: path
         *         required: true
         *       - name: subTask
         *         description: Sub Task object
         *         in: body
         *         required: true
         *         schema:
         *           $ref: '#/definitions/subTaskUpdate'
         *     responses:
         *       200:
         *         description: Successfully Update Sub Task
         */
        this._app.put('/api/v1/user/:userId/tasks/:taskId/subtask/:subtaskId', (req, res) => {
            let userId = req.params.userId;
            let taskId = req.params.taskId;
            let subtaskId = req.params.subtaskId;
            let subtaskData = req.body;
            service.editTask(userId, taskId, subtaskId, subtaskData)
                .then(
                    (result) => {
                        res.send(result);
                    }
                )
                .catch(
                    (error) => {
                        res.send(error);
                    }
                );
        });

        // /**
        //  * @swagger
        //  * /api/v1/user/{userId}/tasks/{taskId}/subTask/{subTaskId}:
        //  *   get:
        //  *     tags:
        //  *       - SubTaskController
        //  *     description: Returns a single sub task of task
        //  *     produces:
        //  *       - application/json
        //  *     parameters:
        //  *       - name: userId
        //  *         description: User's id
        //  *         in: path
        //  *         required: true
        //  *       - name: taskId
        //  *         description: Task's id
        //  *         in: path
        //  *         required: true
        //  *       - name: subTaskId
        //  *         description: Sub Task's id
        //  *         in: path
        //  *         required: true
        //  *     responses:
        //  *       200:
        //  *         description: A single Sub Task of task
        //  */
        // this._app.get('/api/v1/user/:userId/tasks/:taskId', (req, res) => {
        //     let userId = req.params.userId;
        //     let taskId = req.params.taskId;
        //     service.getTaskById(userId, taskId)
        //         .then(
        //             (result) => {
        //                 res.send(result);
        //             }
        //         )
        //         .catch(
        //             (error) => {
        //                 res.send(error);
        //             }
        //         );
        // });

        /**
         * @swagger
         * /api/v1/user/{userId}/tasks/{taskId}/subTask/{subTaskId}:
         *   delete:
         *     tags:
         *       - SubTaskController
         *     description: Deletes a single sub task of task
         *     produces:
         *       - application/json
         *     parameters:
         *       - name: userId
         *         description: User's id
         *         in: path
         *         required: true
         *       - name: taskId
         *         description: Task's id
         *         in: path
         *         required: true
         *       - name: subTaskId
         *         description: Sub Task's id
         *         in: path
         *         required: true
         *     responses:
         *       200:
         *         description: Successfully deleted
         */
        this._app.delete('/api/v1/user/:userId/tasks/:taskId/subtask/:subtaskId', (req, res) => {
            let userId = req.params.userId;
            let taskId = req.params.taskId;
            let subtaskId = req.params.subtaskId;
            service.deleteSubtaskById(userId, taskId, subtaskId)
                .then(
                    (result) => {
                        res.send(result);
                    }
                ).catch(
                    (error) => {
                        res.send(error);
                    }
                );
        })
    }
}

module.exports = SubtaskController;