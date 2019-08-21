const service = require('../services/taskService');


/**
 * @swagger
 * tags:
 *   name: TaskController
 *   description: Task management
 */

/**
 * @swagger
 * definitions:
 *      task:
 *          properties:
 *              tittle:
 *                  type: string
 *              discription:
 *                  type: string
 *              startDate:
 *                  type: date
 *              dueDate:
 *                  type: date
 *              assignee:
 *                  type: string
 *              priority:
 *                  type: string
 *      taskUpdate:
 *          properties:
 *              tittle:
 *                  type: string
 *              discription:
 *                  type: string
 *              startDate:
 *                  type: date
 *              dueDate:
 *                  type: date
 *              assignee:
 *                  type: string
 *              priority:
 *                  type: string
 *              isComplated:
 *                  type: boolean
 */
class TaskController {
    constructor(app) {
        this._app = app;
        this.routeHandler();
    }

    routeHandler() {
       
        /**
         * @swagger
         *  /api/v1/user/{userId}/task:
         *   get:
         *     tags:
         *       - TaskController
         *     description: Returns all tasks of user
         *     produces:
         *       - application/json
         *     parameters:
         *       - name: userId
         *         description: User's id
         *         in: path
         *         required: true
         *     responses:
         *       200:
         *         description: An array of task of user
         */
        //get all tasks
        this._app.get('/api/v1/user/:userId/tasks', (req, res) => {
            let userId = req.params.userId;
            service.getAllTask(userId)
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
         * /api/v1/user/{userId}/task:
         *   post:
         *     tags:
         *       - TaskController
         *     description: Creates a new Task of User
         *     produces:
         *       - application/json
         *     parameters: 
         *       - name: userId
         *         description: User's id
         *         in: path
         *         required: true
         *       - name: task
         *         description: Task object
         *         in: body
         *         required: true
         *         schema:
         *           $ref: '#/definitions/task'
         *     responses:
         *       200:
         *         description: Successfully Add Task
         */
        //add tasks
        this._app.post('/api/v1/user/:userId/tasks', (req, res) => {
            let userId = req.params.userId;
            let taskData = req.body;
            service.addTask(userId, taskData)
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
         * /api/v1/user/{userId}/task/{taskId}:
         *   put:
         *     tags:
         *       - TaskController
         *     description: Update a  Task of User
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
         *       - name: task
         *         description: Task object
         *         in: body
         *         required: true
         *         schema:
         *           $ref: '#/definitions/taskUpdate'
         *     responses:
         *       200:
         *         description: Successfully Update Task
         */
        //edit tasks 
        this._app.put('/api/v1/user/:userId/tasks/:taskId', (req, res) => {
            // let userId = req.params.userId;
            let taskId = req.params.taskId;
            let taskData = req.body;
            service.editTask(taskId, taskData)
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

         /**
         * @swagger
         * /api/v1/user/{userId}/task/{taskId}:
         *   get:
         *     tags:
         *       - TaskController
         *     description: Returns a single task
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
         *         description: A single Task
         */
        // get task by id 
        this._app.get('/api/v1/user/:userId/tasks/:taskId', (req, res) => {
            let userId = req.params.userId;
            let taskId = req.params.taskId;
            service.getTaskById(userId, taskId)
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

        /**
         * @swagger
         * /api/v1/user/{userId}/task/{taskId}:
         *   delete:
         *     tags:
         *       - TaskController
         *     description: Deletes a single task
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
         *         description: Successfully deleted
         */
        //delete task by id
        this._app.delete('/api/v1/user/:userId/tasks/:taskId', (req, res) => {
            let userId = req.params.userId;
            let taskId = req.params.taskId;
            service.deleteTaskById(userId, taskId)
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

module.exports = TaskController;