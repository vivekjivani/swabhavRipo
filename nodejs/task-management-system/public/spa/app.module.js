var app = angular.module('task.management.system', ['task.service', 'ngRoute']);

app.config(function ($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl: "./fragment/login.html",
            controller: "LoginController"
        })
        .when("/userProfile", {
            templateUrl: "./fragment/userProfile.html",
            controller: "UserProfileController"
        })
        .when("/subTask", {
            templateUrl: "./fragment/subTask.html",
            controller: "SubTaskController"
        });
});

app.controller('LoginController', ['$scope', '$location', '$window', 'TaskFactory', function ($scope, $location, $window, TaskFactory) {
    $scope.loginInfo = {
        emailId: "",
        password: ""
    }
    $scope.login = function () {
        // console.log($scope.loginInfo);
        TaskFactory.login($scope.loginInfo)
            .then(
                (response) => {
                    // console.log(response.data);
                    if(!response.data._id){
                        // console.log('arghh');
                        // $location.path('/');
                        $window.alert('email/password invalied');
                    }else{
                        // console.log('switch page');
                        $window.sessionStorage.userId = response.data._id;
                        $location.path('/userProfile');
                    }
                }
            ).catch(
                (error) => {
                    console.log(error);
                }
            );
    }
}]);

app.controller('UserProfileController', ['$scope', '$location', '$window', 'TaskFactory', function ($scope, $location, $window, TaskFactory) {
    $scope.userId = $window.sessionStorage.userId;
    TaskFactory.getUserData($scope.userId)
        .then(
            (result) => {
                console.log(result.data[0]);
                $window.sessionStorage.user = result.data[0];
                $scope.user = result.data[0];
            }
        )
        .catch(
            (error) => {
                console.log(error);
            }
        );

    $scope.displaySubTasks = function (){
        $location.path('/subTask');
    }

    $scope.logout= function(){
        $window.sessionStorage.user = null;
        $window.sessionStorage.userId = null;
        $location.path('/');
    }
}]);

app.controller('UserProfileController', ['$scope', '$location', '$window', 'TaskFactory', function ($scope, $location, $window, TaskFactory) {
    $scope.user = $window.sessionStorage.user;
    
}]);

