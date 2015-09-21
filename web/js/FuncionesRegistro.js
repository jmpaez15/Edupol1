/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {
    $("#divdatosSocioEconomicos").hide();
    $("#divDatosIcfes").hide();
    $("#divDatosUniversidad").hide();
   // $("#divDatosCodeudor").hide();
    $("#divDatosHomologacion").hide();
    $("#divDatosPagos").hide();
    $("#divSimulador").hide();
    $("#divDocumentosRespaldo").hide();
    $("#divFinalizacionSolicitud").hide();


    $("#divCredito").hide();
    $("#divCualAtenPsiqui").hide();
    $("#divCuantoArriendo").hide();
    $("#divCuantoPension").hide();
    $("#divCualesOtros").hide();
    $("#divCuantoGastosFamiliares").hide();
    $("#divCuantoOtrosGastos").hide();
    $("#formaPago").change(function () {
        if ($("#formaPago").val() != "credito") {
            $("#divCredito").hide();
        }
        if ($("#formaPago").val() == "credito") {
            $("#divCredito").show();
        }

    });
    $("input[name='atencPsiquia']").click(function () {
        if ($("input[name='atencPsiquia']:checked").val() == "S") {
            $("#divCualAtenPsiqui").show();
        }
        else {
            $("#divCualAtenPsiqui").hide();
        }

    });
    $("input[name='IngresoArredamien']").click(function () {
        if ($("input[name='IngresoArredamien']:checked").val() == "S") {
            $("#divCuantoArriendo").show();
        }
        else {
            $("#divCuantoArriendo").hide();
        }

    });
    $("input[name='IngresoPension']").click(function () {
        if ($("input[name='IngresoPension']:checked").val() == "S") {
            $("#divCuantoPension").show();
        }
        else {
            $("#divCuantoPension").hide();
        }

    });
    $("input[name='IngresoOtros']").click(function () {
        if ($("input[name='IngresoOtros']:checked").val() == "S") {
            $("#divCualesOtros").show();
        }
        else {
            $("#divCualesOtros").hide();
        }

    });
    $("input[name='GastosFamiliares']").click(function () {
        if ($("input[name='GastosFamiliares']:checked").val() == "S") {
            $("#divCuantoGastosFamiliares").show();
        }
        else {
            $("#divCuantoGastosFamiliares").hide();
        }

    });
    $("input[name='otrosGastos']").click(function () {
        if ($("input[name='otrosGastos']:checked").val() == "S") {
            $("#divCuantoOtrosGastos").show();
        }
        else {
            $("#divCuantoOtrosGastos").hide();
        }

    });
});
