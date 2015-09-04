appEdupol.controller('PreRegistroController', ['$http', getDataFromServer]);
function getDataFromServer($http) {
    var actualiza = this;
    $http({
        method: 'GET',
        url: "../PreRegistroControl",
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

    actualiza.save = function () {
        actualiza.person.PreRegistro.condicion=0;
        actualiza.datos = actualiza.person.PreRegistro;
        alert("Actualiza Datos:" + actualiza.person.PreRegistro);
        $http({
            method: 'POST',
            url: "../PreRegistroControl",
            headers: {'Content-Type': 'application/json;charset=Utf-8'},
            data: actualiza.datos
        }).success(function (data, status, headers, config) {
            alert("Actualiza Datos: " + data);
        }).error(function (data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };
    
    actualiza.actualizaUni = function (indice) {
        actualiza.person.PreRegistro.estudiante.infoUni.condicion=1;
        actualiza.person.PreRegistro.estudiante.infoUni.indiceUni=indice;
        actualiza.datos= actualiza.person.PreRegistro.estudiante.infoUni
        alert("Actualiza Datos:" +actualiza.datos);
        $http({
            method: 'POST',
            url: "../PreRegistroControl",
            headers: {'Content-Type': 'application/json;charset=Utf-8'},
            data: actualiza.datos
          }).success(function (data, status, headers, config) {
              switch (indice){
                  case 1:
                      actualiza.nivelFormacio=data;
                      break;
                  case 2: 
                      actualiza.nivelEstudio=data;
                      break;
                  case 3:
                      actualiza.grupoPrograma=data;
                      break;
                  case 4:
                      actualiza.programas=data;
              }
            
            alert(actualiza.infoUniversidad)
        }).error(function (data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };
    
    actualiza.listasPais = function (indice,indicePersona) {
        switch (indicePersona){
            case 1:
                actualiza.person.PreRegistro.estudiante.paisRes.condicion=2;
                actualiza.datos= actualiza.person.PreRegistro.estudiante.paisRes;
                break;
            case 2:
                actualiza.person.PreRegistro.acudiente.paisRes.condicion=2;
                actualiza.datos=actualiza.person.PreRegistro.acudiente.paisRes;
                break;
        }
       
        alert("Actualiza Datos:" +actualiza.datos);
        $http({
            method: 'POST',
            url: "../PreRegistroControl",
            headers: {'Content-Type': 'application/json;charset=Utf-8'},
            data: actualiza.datos
          }).success(function (data, status, headers, config) {
              switch (indice){
                  case 1:
                      actualiza.Departamento=data;
                      break;
                  case 2: 
                      actualiza.ciudad=data;
                      break;
                  case 3:
                      actualiza.grupoPrograma=data;
                      break;
                  case 4:
                      actualiza.programas=data;
              }
            
            alert(actualiza.infoUniversidad)
        }).error(function (data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };
    
   

}
;
