let contactService = angular.module('employeeService', []);

contactService.factory('employeeFactory', ['$q', '$http', '$log', function ($q, $http, $log) {
    let service = {};

    service.getEmployee = function () {
        return $q((resolve, reject) => {
            $http.get('http://localhost:8080/api/v1/dept/employee').then(
                (result) => {
                    resolve(result);
                }).catch(
                    (error) => {
                    // console.log(error);
                    reject(error);
                });
        });
    }

    return service;
}]);