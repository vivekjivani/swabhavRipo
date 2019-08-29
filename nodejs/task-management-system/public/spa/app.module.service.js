var taskService = angular.module('task.service', []);

taskService.factory('TaskFactory', ['$q', '$http', function ($q, $http) {

    var service = {};

    service.login = function (loginInfo) {
        return $q((resolve, reject) => {
            var url = '/api/v1/user/login';
            let data = loginInfo;
            $http.post(url, data)
                .then((response) => {
                    resolve(response);
                })
                .catch((error) => {
                    reject(error);
                });
        });
    }

    service.getUserTask = function (userId) {
        return $q((resolve, reject) => {
            var url = '/api/v1/user/' + userId + '/tasks';
            $http.get(url)
                .then((response) => {
                    resolve(response);
                })
                .catch((error) => {
                    reject(error);
                });
        });
    }

    service.getUserData = function (userId) {
        return $q((resolve, reject) => {
            var url = '/api/v1/user/' + userId;
            $http.get(url)
                .then(
                    (response) => {
                        resolve(response);
                    }
                ).catch(
                    (error) => {
                        reject(error);
                    }
                );
        });
    }

    service.updateUser = function (userId, userData) {
        return $q((resolve, reject) => {
            var url = '/api/v1/user/' + userId;
            $http.put(url, userData)
                .then(
                    (response) => {
                        resolve(response);
                    }
                ).catch(
                    (error) => {
                        reject(error);
                    }
                );
        });
    }

    service.addTask = function (userId, taskData) {
        return $q((resolve, reject) => {
            var url = '/api/v1/user/' + userId + '/tasks';
            $http.post(url, taskData)
                .then(
                    (response) => {
                        resolve(response);
                    }
                ).catch(
                    (error) => {
                        reject(error);
                    }
                );
        });
    }

    service.updateTask = function (userId, taskId, taskData){
        return $q((resolve, reject) => {
            var url='/api/v1/user/'+userId+'/tasks/'+taskId;
            $http.put(url, taskData)
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

    service.getAllSubtask = function (userId, taskId) {
        return $q((resolve, reject) => {
            // console.log(userId, taskId);
            var url = "/api/v1/user/" + userId + "/tasks/" + taskId + "/subtask";
            $http.get(url)
                .then(
                    (response) => {
                        resolve(response);
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                );
        });
    }

    service.deleteTask = function (userId, taskId) {
        return $q((resolve, reject) => {
            // console.log(userId, taskId);
            var url = "/api/v1/user/" + userId + "/tasks/" + taskId;
            $http.delete(url)
                .then(
                    (response) => {
                        resolve(response);
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                );
        });
    }

    service.addSubTask = function (userId, taskId, subTaskData) {
        return $q((resolve, reject) => {
            var url = '/api/v1/user/' + userId + "/tasks/" + taskId + "/subTask";
            $http.post(url, subTaskData)
                .then(
                    (response) => {
                        resolve(response);
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                );
        });
    }

    service.deleteSubTask = function (userId, taskId, subtaskId) {
        return $q((resolve, reject) => {
            var url = '/api/v1/user/' + userId + "/tasks/" + taskId + "/subTask/" + subtaskId;
            $http.delete(url)
                .then(
                    (response) => {
                        resolve(response);
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                );
        });
    }

    service.registerUser = function (userData) {
        return $q((resolve, reject) => {
            var url = "/api/v1/user";
            $http.post(url, userData)
                .then(
                    (response) => {
                        resolve(response);
                    }
                )
                .catch(
                    (error) => {
                        reject(error);
                    }
                );
        });
    }
    return service;
}]);