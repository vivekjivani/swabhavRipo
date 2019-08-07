var app = angular.module('ContactApp.spa', ['ngRoute', 'employeeService']);

app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'fragment/home.html',
            controller: 'homeController'
        })
        .when('/employee', {
            templateUrl: 'fragment/employeeDataView.html',
            controller: 'viewEmployeeController'
        })
        .otherwise('/');
}]);

app.controller('homeController', ['$scope', function ($scope) {
    $scope.content = "Welcome To Employee Management App!";
}]);

app.controller('viewEmployeeController', ['$scope', '$http', 'employeeFactory', function ($scope, $http, employeeFactory) {


    $scope.getAllEmployee = function () {
        employeeFactory.getEmployee()
            .then(
                (result) => {
                    // console.log(data);
                    $scope.arrayOfEmployee = result.data;
                    $scope.arrayOfEmployee.forEach(element => {
                        // console.log(element.COMM);
                        if (element.COMM == '' || element.COMM == null) {
                            element.COMM = 0;
                        }
                    });
                }
            )
            .catch(
                (err) => {
                    console.log(err);
                }
            );
    }
}]);
