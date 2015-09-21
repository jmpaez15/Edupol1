/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
appEdupol.controller('RegistroController', ['$http', getDataFromServer]);
function getDataFromServer($http) {
    var registro = this;
    var estudiante;
    $http({
        method: 'GET',
        url: "../RegistroControl?modulo=1",
        headers: {'Content-Type': 'application/json'}
    }).success(function (data, status, headers, config) {
        registro.rol = data;
        if (registro.rol == "acudiente") {
            $("#divDatosComplementariosEstudian").hide();
        } else {
            estudiante = registro.rol;
            $("#divFiltroEstudiantes").hide();
            $("#datosComplementarios").addClass("panel-collapse collapse in");
        }
    }).error(function (data, status, headers, config) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });

    registro.filtro = function () {
        if ($("#tipFiltro").val() != "") {
            if ($("#filtroCedula").val() != "") {
                registro.estudiante.filtro.condicion = 1;
                registro.datos = registro.estudiante.filtro;
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
            }
        }
    };

    registro.guardarFiltro = function (estudiante) {
        estudiante = estudiante;
        if (estudiante) {
            $("#FiltroEstudiantes").collapse();
            $("#datosComplementarios").collapse();
            $("#divDatosComplementariosEstudian").show();

        }
    };
}
;

appEdupol.controller('DatosComplementariosController', ['$http', getDatosComplementarios]);
appEdupol.controller('DatosSocioeconomicosController', ['$http', getDatosSocioeconomicos]);
appEdupol.controller('DatosIcfesController', ['$http', getDatosIcfes]);
appEdupol.controller('DatosUniversidadesController', ['$http', getDatosUniversidades]);
appEdupol.controller('DatosCodeudorController', ['$http', getCodeudor]);
appEdupol.controller('DatosHomologacionesController', ['$http', getDatosHomologaciones]);
appEdupol.controller('DatosModalidadPagoController', ['$http', getDatosModalidadPago]);
appEdupol.controller('DatosSimuladorController', ['$http', getDatosSimulador]);
appEdupol.controller('DatosDocumentosController', ['$http', getDatosDocumentos]);
appEdupol.controller('DatosFinalizacionController', ['$http', getDatosFinalizacion]);

function getDatosComplementarios($http) {
    var complementarios = this;

    complementarios.secuenciaModulos = function () {
        var validar = complementarios.DatosComplementariosEstudiantes();
        if (validar) {
            alert("entra en if");
            $("#datosComplementarios").collapse("toggle");
            complementarios.esconder = true;
            $("#datosSocioEconomicos").collapse("toggle");
            $("#divdatosSocioEconomicos").show();
        }
    };
    //metodos de validaciones
    complementarios.DatosComplementariosEstudiantes = function () {

        if ($("#pAcademico").val() == "") {
            $("#pAcademico").focus();
            return false;
        }
        /*if ($("#sFondoPensionesCesantias").val() == "") {
         $("#sFondoPensionesCesantias").focus();
         return false;
         }*/
        if ($("#paisEscuSecundaria").val() == "") {
            $("#paisEscuSecundaria").focus();
            return false;
        }
        /*if ($("#sCategoriaSisben").val() == "") {
         $("#sCategoriaSisben").focus();
         return false;
         }*/
        if ($("#DepEscusecu").val() == "") {
            $("#DepEscusecu").focus();
            return false;
        }
        if ($("#sNombreEscuela").val() == "") {
            $("#sNombreEscuela").focus();
            return false;
        }
        if ($("#CiudadEscuSecu").val() == "") {
            $("#CiudadEscuSecu").focus();
            return false;
        }
        if ($("#fechaGraduacion").val() == "") {
            $("#fechaGraduacion").focus();
            return false;
        }
        /*if ($("#EntidadPromotoraS").val() == "") {
         $("#EntidadPromotoraS").focus();
         return false;
         }*/
        return true;
    }
    complementarios.esconder = false;
}
;

function getDatosSocioeconomicos($http) {
    var socioeconomico = this;

    socioeconomico.secuenciaModulosEconomico = function () {
        var validar = socioeconomico.DatosSocioEconomicos();
        if (validar) {
            alert("entra en if");
            $("#datosSocioEconomicos").collapse("toggle");
            $("#divIcfes").collapse("toggle");
            $("#divDatosIcfes").show();
            socioeconomico.esconder = true;
        }
    };
    //metodos de validaciones
    socioeconomico.DatosSocioEconomicos = function () {

        /*if ($("#comunidad").val() == "") {
         $("#comunidad").focus();
         return false;
         }*/
        if ($("#formaPago").val() == "") {
            $("#formaPago").focus();
            return false;
        }
        if ($("#divCredito").is(":visible") && $("#divCredito").val() == "") {
            alert("soy visible");
            $("#divCredito").focus();
            return false;
        }
        if ($("#costeoEstudios").val() == "") {
            $("#costeoEstudios").focus();
            return false;
        }
        /*if ($("#cargueFoto").val() == "") {
         $("#cargueFoto").focus();
         return false;
         }*/
        if (!$("input[name='ayudaFinaciera']").is(':checked')) {
            $("#SiayudaFinaciera").focus();
            return false;
        }
        /*if (!$("input[name='LimitacionFisica']").is(':checked')) {
         $("#SiLimitacionFisica").focus();
         return false;
         }*/
        if ($("#tipoSolicitud").val() == "") {
            $("#tipoSolicitud").focus();
            return false;
        }
        if ($("#nombreAsesor").val() == "") {
            $("#nombreAsesor").focus();
            return false;
        }
        /*if ($("input[name='EnfermedadC']").is(':checked')) {
         $("#EnfermedadC").focus();
         return false;
         }*/
        return true;
    }
    socioeconomico.esconder = false;
}
;

function getDatosIcfes($http) {
    var icfes = this;
    alert('Entro DatosIcfes');
    $http({
        method: 'GET',
        url: "../RegistroControl?modulo=4",
        headers: {'Content-Type': 'application/json'}
    }).success(function (data, status, headers, config) {
        icfes.estudiante = data;
    }).error(function (data, status, headers, config) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });

    icfes.secuenciaModulosIcfes = function () {
        var validar = icfes.DatosIcfes();
        if (validar) {
            alert("entra en if");
            $("#divIcfes").collapse("toggle");
            $("#universidad").collapse("toggle");
            $("#divDatosUniversidad").show();
        }
    };
    //metodos de validaciones
    icfes.DatosIcfes = function () {
        if ($("#numRegIcfes").val() == "") {
            $("#numRegIcfes").focus();
            return false;
        }
        if ($("#fechaIcfes").val() == "") {
            $("#fechaIcfes").focus();
            return false;
        }
        return true;
    };
}
;

function getDatosUniversidades($http) {
    var univeridades = this;

    univeridades.secuenciaModulosUniversidades = function () {

        alert("entra en if");
        $("#universidad").collapse("toggle");
        $("#codeudorDatos").collapse("toggle");
        $("#divDatosCodeudor").show();
    };
    univeridades.esconder = true;
}
;

function getCodeudor($http) {
    var codeudor = this;
    $http({
        method: 'GET',
        url: "../RegistroControl?modulo=1",
        headers: {'Content-Type': 'application/json'}
    }).success(function (data, status, headers, config) {
        codeudor.person = data;
    }).error(function (data, status, headers, config) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });
    
   /* $(document).ready(function () {
        $('#example').DataTable();
    });*/



    codeudor.save = function () {
        codeudor.person = condicion = 6;
       /* codeudor.datos = codeudor.person;
        alert("Por favor espere un momento");
        $http({
            method: 'POST',
            url: "../RegistroControl",
            headers: {'Content-Type': 'application/json;charset=Utf-8'},
            data: codeudor.datos
        }).success(function (data, status, headers, config) {
            
                codeudor.person = data;
            
        }).error(function (data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
*/

    };


    codeudor.listasPais = function (indice) {
        switch (indice) {
            case 1:
                codeudor.person.paisNac.condicion = 2;
                codeudor.person.paisNac.indice = indice;
                codeudor.datos = codeudor.person.paisNac;
                break;
            case 2:
                codeudor.person.depNac.condicion = 2;
                codeudor.person.depNac.indice = indice;
                codeudor.datos = codeudor.person.depNac;
                break;
            case 4:
                codeudor.person.paisRes.condicion = 2;
                codeudor.person.paisRes.indice = indice;
                codeudor.datos = codeudor.person.paisRes;
                break;
            case 5:
                codeudor.person.depRes.condicion = 2;
                codeudor.person.depRes.indice = indice;
                codeudor.datos = codeudor.person.depRes;
                break;
        }




        $http({
            method: 'POST',
            url: "../RegistroControl",
            headers: {'Content-Type': 'application/json;charset=Utf-8'},
            data: codeudor.datos
        }).success(function (data, status, headers, config) {
            switch (indice) {
                case 1:
                    codeudor.DepartamentoNacimiento = data;
                    break;
                case 2:
                    codeudor.ciudadNacimiento = data;
                    break;
                case 4:
                    codeudor.DepartamentoResidencia = data;
                    break;
                case 5:
                    codeudor.ciudadResidencia = data;
                    break;
            }


        }).error(function (data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };


    codeudor.secuenciaModulosCodeudor = function () {

        alert("entra en if");
        $("#codeudorDatos").collapse("toggle");
        $("#divHomologacion").collapse("toggle");
        $("#divDatosHomologacion").show();
    };

}
;

function getDatosHomologaciones($http) {
    var homologacion = this;

    homologacion.secuenciaModulosHomologaciones = function () {

        alert("entra en if");
        $("#divHomologacion").collapse("toggle");
        $("#ModaPago").collapse("toggle");
        $("#divDatosPagos").show();
    };
    homologacion.esconder = true;
}
;

function getDatosModalidadPago($http) {
    var modalidaPago = this;

    modalidaPago.secuenciaModulosPago = function () {

        alert("entra en if");
        $("#ModaPago").collapse("toggle");
        $("#simulador").collapse("toggle");
        $("#divSimulador").show();
    };
    modalidaPago.esconder = true;
}
;

function getDatosSimulador($http) {
    var simulador = this;

    simulador.secuenciaModulosSimuladorCredito = function () {

        alert("entra en if");
        $("#simulador").collapse("toggle");
        $("#respalCredito").collapse("toggle");
        $("#divDocumentosRespaldo").show();
    };
    simulador.esconder = true;
}
;

function getDatosDocumentos($http) {
    var documentos = this;

    documentos.secuenciaModulosRespaldoCredito = function () {

        alert("entra en if");
        $("#respalCredito").collapse("toggle");
        $("#solicitudCre").collapse("toggle");
        $("#divFinalizacionSolicitud").show();
    };
    documentos.esconder = true;
}
;

function getDatosFinalizacion($http) {
    var final = this;

    final.secuenciaModulosSolicitudCredito = function () {
        alert("entra en if");
        $("#solicitudCre").collapse("toggle");
    };
    final.esconder = true;
}
;
