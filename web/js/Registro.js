/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
appEdupol.controller('RegistroController', ['$http', getDataFromServer]);
function getDataFromServer($http) {
    var registro = this;
    $http({
        method: 'GET',
        url: "../RegistroControl",
        headers: {'Content-Type': 'application/json'}
    }).success(function (data, status, headers, config) {
        registro.person = data;
    }).error(function (data, status, headers, config) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });
    $(document).ready(function () {
        $('#example').DataTable();
    });

    registro.filtro = function () {

        registro.datos = registro.person.filtro;
        alert("Por favor espere un momento");
        $http({
            method: 'POST',
            url: "../RegistroControl",
            headers: {'Content-Type': 'application/json;charset=Utf-8'},
            data: registro.datos
        }).success(function (data, status, headers, config) {
            if (data.length > 0) {

                registro.person = data;
            } else {
                alert("El aspirante no existe");
            }

        }).error(function (data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };
}
;