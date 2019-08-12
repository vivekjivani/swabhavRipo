const service = require('../services/SubtaskService');

class SubtaskController {
    constructor(app) {
        this._app = app;
        this.routeHandler();
    }

    routeHandler() {
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

        this._app.post('/api/v1/user/:userId/tasks/:taskId/subtask', (req, res) => {
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

        this._app.put('/api/v1/user/:userId/tasks/:taskId', (req, res) => {
            let userId = req.params.userId;
            let taskId = req.params.taskId;
            let taskData = req.body;
            service.editTask(userId, taskId, taskData)
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

module.exports = SubtaskController;