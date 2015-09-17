

function DatosComplementariosEstudiantes(){
     $(".error").fadeOut().remove();
    if ($("#pAcademico").val() == "") {
            $("#pAcademico").focus().after('<span class="error">Campo Obligatorio</span>');
            return false;
        }
        
    if ($("#paisEscuSecundaria").val() == "") {
            $("#paisEscuSecundaria").focus().after('<span class="error">Campo Obligatorio</span>');
            return false;
        }    
        
    if ($("#DepEscusecu").val() == "") {
            $("#DepEscusecu").focus().after('<span class="error">Campo Obligatorio</span>');
            return false;
        }
    if ($("#CiudadEscuSecu").val() == "") {
            $("#CiudadEscuSecu").focus().after('<span class="error">Campo Obligatorio</span>');
            return false;
        }
    if ($("#EntidadPromotoraS").val() == "") {
            $("#EntidadPromotoraS").focus().after('<span class="error">Campo Obligatorio</span>');
            return false;
        } 
    if ($("#sFondoPensionesCesantias").val() == "") {
            $("#sFondoPensionesCesantias").focus().after('<span class="error">Campo Obligatorio</span>');
            return false;
        }
    if ($("#sCategoriaSisben").val() == "") {
            $("#sCategoriaSisben").focus().after('<span class="error">Campo Obligatorio</span>');
            return false;
        }
    if ($("#sNombreEscuela").val() == "") {
            $("#sNombreEscuela").focus().after('<span class="error">Campo Obligatorio</span>');
            return false;
        }
    if ($("#fechaGraduacion").val() == "") {
            $("#fechaGraduacion").focus().after('<span class="error">Campo Obligatorio</span>');
            return false;
        }
        return true;
        
}