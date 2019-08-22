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
    return service;
}]);