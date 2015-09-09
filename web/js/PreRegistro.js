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
        if(!document.getElementById("sFechaExpedicionAcu").value==""){
            actualiza.person.PreRegistro.acudiente.fechExp=document.getElementById("sFechaExpedicionAcu").value;
        }
        actualiza.person.PreRegistro.estudiante.fechaExp=document.getElementById("sFechaExpedicionEst").value;
        actualiza.person.PreRegistro.estudiante.FechaNac=document.getElementById("sFechaNacimiento").value;
        actualiza.person.PreRegistro.condicion=0;
        actualiza.datos = actualiza.person.PreRegistro;
        alert("Por favor espere un momento");
        $http({
            method: 'POST',
            url: "../PreRegistroControl",
            headers: {'Content-Type': 'application/json;charset=Utf-8'},
            data: actualiza.datos
        }).success(function (data, status, headers, config) {
            alert("se realizo la inscripcion satisfactoriamente");
        }).error(function (data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };
    
    actualiza.actualizaUni = function (indice) {
        actualiza.person.PreRegistro.estudiante.infoUni.condicion=1;
        actualiza.person.PreRegistro.estudiante.infoUni.indiceUni=indice;
        actualiza.datos= actualiza.person.PreRegistro.estudiante.infoUni
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
            
            
        }).error(function (data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };
    
    actualiza.listasPais = function (indice,indicePersona) {
        switch (indicePersona){
            case 1:
                switch (indice){
                    case 1:
                          actualiza.person.PreRegistro.estudiante.paisRes.condicion=2;
                          actualiza.person.PreRegistro.estudiante.paisRes.indice=indice;
                          actualiza.datos= actualiza.person.PreRegistro.estudiante.paisRes;
                        break;
                    case 2:
                          actualiza.person.PreRegistro.estudiante.depRes.condicion=2;
                          actualiza.person.PreRegistro.estudiante.depRes.indice=indice;
                          actualiza.datos=actualiza.person.PreRegistro.estudiante.depRes;
                        break;
                }
                break;
            case 2:
                switch (indice){
                    case 1: 
                          actualiza.person.PreRegistro.acudiente.paisRes.condicion=2;
                          actualiza.person.PreRegistro.acudiente.paisRes.indice=indice
                          actualiza.datos=actualiza.person.PreRegistro.acudiente.paisRes;
                        break;
                    case 2:
                          actualiza.person.PreRegistro.acudiente.depRes.condicion=2;
                          actualiza.person.PreRegistro.acudiente.depRes.indice=indice
                          actualiza.datos=actualiza.person.PreRegistro.acudiente.depRes;
                          break;
                }
               
                break;
            case 3:
                 switch (indice){
                    case 1: 
                          actualiza.person.PreRegistro.estudiante.paisEstudio.condicion=2;
                          actualiza.person.PreRegistro.estudiante.paisEstudio.indice=indice;
                          actualiza.datos=actualiza.person.PreRegistro.estudiante.paisEstudio;
                        break;
                    case 2:
                          actualiza.person.PreRegistro.estudiante.depEstudio.condicion=2;
                          actualiza.person.PreRegistro.estudiante.depEstudio.indice=indice;
                          actualiza.datos=actualiza.person.PreRegistro.estudiante.depEstudio;
                        break;
                    case 3:
                          actualiza.person.PreRegistro.estudiante.ciudadEstudio.condicion=2;
                          actualiza.person.PreRegistro.estudiante.ciudadEstudio.indice=indice;
                          actualiza.datos=actualiza.person.PreRegistro.estudiante.ciudadEstudio;
                          break;
                }
               
                break;
        }
       
        
        $http({
            method: 'POST',
            url: "../PreRegistroControl",
            headers: {'Content-Type': 'application/json;charset=Utf-8'},
            data: actualiza.datos
          }).success(function (data, status, headers, config) {
                switch (indicePersona){
                 
                    case 1:
                          switch (indice){
                              case 1:
                                  actualiza.Departamento=data;
                                  break;
                              case 2: 
                                  actualiza.ciudad=data;
                                  break;
                            }
                          break;
                      case 2:
                          switch (indice){
                              case 1:
                                  actualiza.DepartamentoAcudiente=data;
                                  break;
                              case 2: 
                                  actualiza.ciudadAcudiente=data;
                                  break;
                            }
                          break;
                      case 3:
                          case 2:
                          switch (indice){
                              case 1:
                                  actualiza.DepartamentoEstudio=data;
                                  break;
                              case 2: 
                                  actualiza.ciudadEstudio=data;
                                  break;
                              case 3:
                                  actualiza.centroAsociado=data;
                            }
                          break;
                }
           
        }).error(function (data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };
    
   

}
;
