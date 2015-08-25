var appLogin = angular.module('appLogin', []);

appLogin.controller('loginController', ['$http','$window', validaUser]);
    
function validaUser($http, $window) {
    
    var window = $window.location;
    var login = this;
    login.valida = function() {

        $http({
            method: 'POST',
            url: "./LoginControl",
            headers: {'Content-Type': 'application/json'},
            data: login.credencial
        }).success(function(data, status, headers, config) {
            if (data.toString() === "OK") {
                 window.href = "./General/Menu.html";
            } else {
                alert('Login: ' + data);
            }
        }).error(function(data, status, headers, config) {
            alert('Error: ' + status);
        });
    };
}
;
