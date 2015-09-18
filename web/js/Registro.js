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

    actualiza.filtro = function () {

        actualiza.datos = actualiza.person.filtro;
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

    codeudor.secuenciaModulosCodeudor = function () {

        alert("entra en if");
        $("#codeudorDatos").collapse("toggle");
        $("#divHomologacion").collapse("toggle");
        $("#divDatosHomologacion").show();
    };
    codeudor.esconder = true;
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
