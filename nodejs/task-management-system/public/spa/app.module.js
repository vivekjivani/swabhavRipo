var app = angular.module('task.management.system', ['task.service', 'ngRoute', 'ngStorage']);

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
        })
        .when("/addTask", {
            templateUrl: "./fragment/addTask.html",
            controller: "AddTaskController"
        })
        .when("/registration", {
            templateUrl: "./fragment/registration.html",
            controller: "RegistrationController"
        })
        .when("/addSubTask", {
            templateUrl: "./fragment/addSubTask.html",
            controller: "AddSubTaskController"
        })
        .when("/editProfile", {
            templateUrl: "./fragment/editProfile.html",
            controller: "UserProfileController"
        })
        .when("/refresher", {
            templateUrl: "./fragment/refresher.html",
            controller: "RefresherController"
        });
});

app.controller('LoginController', ['$scope', '$location', '$window', '$localStorage', 'TaskFactory', function ($scope, $location, $window, $localStorage, TaskFactory) {
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
                    if (!response.data._id) {
                        $window.alert('email/password invalied');
                    } else {
                        // console.log('switch page');
                        $window.sessionStorage.userId = response.data._id;
                        // $localStorage.token = response.data.token;
                        // console.log(response.data.token);
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
                // console.log(result.data[0]);
                $scope.user = result.data[0];
            }
        )
        .catch(
            (error) => {
                console.log(error);
            }
        );

    TaskFactory.getUserTask($scope.userId)
        .then(
            (result) => {
                // console.log(result.data);
                $scope.tasks = result.data;
            }
        )
        .catch(
            (error) => {
                console.log(error);
            }
        );

    $scope.edit = function () {
        $location.path("/editProfile");
    }

    $scope.userData = {
        userName: "",
        gender: "",
        birthDate: "",
        phone: "",
        emailId: "",
        address: {
            street: "",
            city: "",
            state: "",
            country: "",
        },
        password: ""
    };

    $scope.update = function () {
        // console.log($scope.userData);
        TaskFactory.updateUser($scope.userId, $scope.userData)
            .then(
                (result) => {
                    // console.log(result);
                    $location.path('/refresher');
                }
            )
            .catch(
                (error) => {
                    console.log(error);
                }
            );
    }
    $scope.addTask = function () {
        $location.path('/addTask');
    }

    $scope.displaySubTasks = function (task_id) {
        $window.sessionStorage.taskId = task_id;
        $location.path('/subTask');
    }

    $scope.deleteTask = function (taskId) {
        TaskFactory.deleteTask($window.sessionStorage.userId, taskId)
            .then(
                (result) => {
                    // console.log(result);
                    $location.path('/refresher');
                }
            )
            .catch(
                (error) => {
                    console.log(error);
                }
            );
    }
    $scope.logout = function () {
        $window.sessionStorage.user = null;
        $window.sessionStorage.userId = null;
        $location.path('/');
    }
}]);

app.controller('SubTaskController', ['$scope', '$location', '$window', 'TaskFactory', function ($scope, $location, $window, TaskFactory) {
    $scope.userId = $window.sessionStorage.userId;
    $scope.taskId = $window.sessionStorage.taskId;
    // console.log($scope.userId, $scope.taskId);
    $scope.delete = function (subtaskId) {
        // console.log(subtaskId);
        TaskFactory.deleteSubTask($scope.userId, $scope.taskId, subtaskId)
            .then((result) => {
                // console.log(result);
                $scope.getSubTask();
            })
            .catch((error) => {
                console.log(error);
            });
    }

    $scope.getSubTask = function () {
        TaskFactory.getAllSubtask($scope.userId, $scope.taskId)
            .then(
                (result) => {
                    // console.log(result.data);
                    $scope.subTasks = result.data;
                }
            )
            .catch(
                (error) => {
                    console.log(error);
                }
            );
    }
    $scope.getSubTask();
}]);

app.controller('AddTaskController', ['$scope', '$location', '$window', 'TaskFactory', function ($scope, $location, $window, TaskFactory) {
    $scope.taskData = {
        title: "",
        description: "",
        startDate: "",
        dueDate: "",
        assignee: ""
    }
    $scope.userId = $window.sessionStorage.userId;

    $scope.addTask = function () {
        TaskFactory.addTask($scope.userId, $scope.taskData)
            .then(
                (result) => {
                    $location.path('/userProfile');
                    // console.log(result);
                }
            )
            .catch(
                (error) => {
                    console.log(error);
                }
            );
    }
}]);

app.controller('RegistrationController', ['$scope', '$location', '$window', 'TaskFactory', function ($scope, $location, $window, TaskFactory) {
    $scope.user = {
        userName: "",
        gender: "",
        birthDate: "",
        phone: "",
        emailId: "",
        street: "",
        city: "",
        state: "",
        country: "",
        password: ""
    };

    $scope.back = function () {
        $location.path("/");
    }

    $scope.register = function () {
        // console.log($scope.user);
        TaskFactory.registerUser($scope.user)
            .then(
                (result) => {
                    // console.log(result);
                    $location.path('/');
                }
            )
            .catch(
                (error) => {
                    console.log(error);
                }
            );
    }
}]);

app.controller("AddSubTaskController", ['$scope', '$location', '$window', 'TaskFactory', function ($scope, $location, $window, TaskFactory) {
    $scope.subTaskData = {
        title: "",
        description: "",
        startDate: "",
        dueDate: "",
        assignee: ""
    }
    $scope.userId = $window.sessionStorage.userId;
    $scope.taskId = $window.sessionStorage.taskId;
    $scope.addSubTask = function () {
        // console.log($scope.userId, $scope.taskId);
        TaskFactory.addSubTask($scope.userId, $scope.taskId, $scope.subTaskData)
            .then(
                (result) => {
                    console.log(result);
                    $location.path("/subTask");
                }
            )
            .catch(
                (error) => {
                    console.log(error);
                }
            );
    }
}]);

app.controller('RefresherController', ['$location', function ($location) {
    $location.path('/userProfile');
}]);