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
        if ($("#tipFiltro").val() != "") {
            if ($("#filtroCedula").val() != "") {
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
        var estudiante = estudiante;
        if (estudiante) {
            $("#FiltroEstudiantes").collapse();
            $("#datosComplementarios").collapse();
        }
    };
}
;


appEdupol.controller('DatosComplementariosController', ['$http', getDatosComplementarios]);

function getDatosComplementarios($http) {
    var registro = this;

    registro.secuenciaModulos = function () {
        var validar = registro.DatosComplementariosEstudiantes();
        if (validar) {
            alert("entra en if");
            $("#datosComplementarios").collapse("toggle");
            $("#datosSocioEconomicos").collapse("toggle");
            $("#divdatosSocioEconomicos").show();
        }

    };

    registro.secuenciaModulosEconomico = function () {
        var validar = registro.DatosSocioEconomicos();
        if (validar) {
            alert("entra en if");
            $("#datosSocioEconomicos").collapse("toggle");
            $("#icfes").collapse("toggle");
            $("#divDatosIcfes").show();
        }
    };

    registro.secuenciaModulosIcfes = function () {
        var validar = registro.DatosIcfes();
        if (validar) {
            alert("entra en if");
            $("#icfes").collapse("toggle");
            $("#univerdidad").collapse("toggle");
            $("#divDatosUniversidad").show();
        }
    };

    registro.secuenciaModulosUniversidades = function () {


        alert("entra en if");
        $("#univerdidad").collapse("toggle");
        $("#codeudorDatos").collapse("toggle");
        $("#divDatosCodeudor").show();


    };

    registro.secuenciaModulosCodeudor = function () {


        alert("entra en if");
        $("#codeudorDatos").collapse("toggle");
        $("#homologacion").collapse("toggle");
        $("#disDatosHomologacion").show();


    };

    registro.secuenciaModulosHomologaciones = function () {


        alert("entra en if");
        $("#homologacion").collapse("toggle");
        $("#ModaPago").collapse("toggle");
        $("#divDatosPagos").show();


    };

    registro.secuenciaModulosPago = function () {


        alert("entra en if");
        $("#ModaPago").collapse("toggle");
        $("#simulador").collapse("toggle");
        $("#divSimulador").show();


    };

    registro.secuenciaModulosSimuladorCredito = function () {


        alert("entra en if");
        $("#simulador").collapse("toggle");
        $("#respalCredito").collapse("toggle");
        $("#divDocumentosRespaldo").show();


    };

    registro.secuenciaModulosRespaldoCredito = function () {


        alert("entra en if");
        $("#respalCredito").collapse("toggle");
        $("#solicitudCre").collapse("toggle");
        $("#divFinalizacionSolicitud").show();


    };

    registro.secuenciaModulosSolicitudCredito = function () {


        alert("entra en if");
        $("#solicitudCre").collapse("toggle");



    };

    ////////////////////////////metodos de validaciones////////////

    registro.DatosComplementariosEstudiantes = function () {

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

    registro.DatosSocioEconomicos = function () {

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

    registro.DatosIcfes = function () {
        if ($("#numRegIcfes").val() == "") {
            $("#numRegIcfes").focus();
            return false;
        }
        if ($("#fechaIcfes").val() == "") {
            $("#fechaIcfes").focus();
            return false;
        }
        return true;
    }

    registro.DatosUniversidad = function () {
        if ($("#ciudadMayorVivir").val() == "") {
            $("#ciudadMayorVivir").focus();
            return false;
        }
        if ($("#otrasUniversidades").val() == "") {
            $("#otrasUniversidades").focus();
            return false;
        }
        return true;
    }

}
;
