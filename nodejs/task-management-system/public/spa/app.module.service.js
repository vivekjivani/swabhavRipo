var taskService = angular.module('task.service', []);

taskService.factory('TaskFactory', ['$q', '$http', function ($q, $http) {
    var service = {};

    service.login = function (loginInfo) {
        return $q((resolve, reject) => {
            var url = 'http://localhost:9090/api/v1/user/login';
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
            var url = 'http://localhost:9090/api/v1/user/'+userId+'/tasks';
            $http.get(url)
                .then((response) => {
                    resolve(response);
                })
                .catch((error) => {
                    reject(error);
                });
        });
    }

    service.getUserData = function(userId){
        return $q((resolve, reject) => {
            var url = 'http://localhost:9090/api/v1/user/'+userId;
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

    service.addTask = function(userId, taskData){
        return $q((resolve, reject) => {
            var url = 'http://localhost:9090/api/v1/user/'+userId+'/tasks';
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

    service.getAllSubtask = function(userId, taskId){
        return $q((resolve, reject) => {
            var url ="http://localhost:9090/api/v1/user/"+userId+"/tasks/"+taskId+"/subtask";
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

    service.deleteTask = function(userId, taskId){
        return $q((resolve, reject) => {
            console.log(userId, taskId);
            var url ="http://localhost:9090/api/v1/user/"+userId+"/tasks/"+taskId;
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
    return service;
}]);