/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
appEdupol.controller('RegistroController', ['$http', getDataFromServer]);
function getDataFromServer($http) {
    var actualiza = this;
    $http({
        method: 'GET',
        url: "../RegistroControl",
        headers: {'Content-Type': 'application/json'}
    }).success(function (data, status, headers, config) {
    actualiza.person = data;
    }).error(function (data, status, headers, config) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });

    $(document).ready(function () {
        $('#example').DataTable();
    });

    actualiza.filtro = function () {
        
            actualiza.datos = actualiza.person;
            alert("Por favor espere un momento");
            $http({
                method: 'POST',
                url: "../RegistroControl",
                headers: {'Content-Type': 'application/json;charset=Utf-8'},
                data: actualiza.datos
            }).success(function (data, status, headers, config) {
               actualiza.person = data;
            }).error(function (data, status, headers, config) {
                // called asynchronously if an error occurs
                // or server returns response with an error status.
            });

       


    };



};
