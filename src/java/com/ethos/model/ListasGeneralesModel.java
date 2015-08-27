 
package com.ethos.model;

import java.util.List;

/**
 *
 * @author Mary
 */


public class ListasGeneralesModel {
    List<TipoIdentificacionModel>lisTipoIdentificacionModels;
    List<GeneroModel>lisGeneroModels;
    List<ProfesionesModel>lisProfesionesModels;
    List<EstadoCivilModel>lisEstadoCivilModels;
    List<TipoSolicitudModel>lisTipoSolicitudModels;
    List<CategoriaSisbenModel>lisCategoriaSisbenModels;
    List<CiudadModel>lisCiudadModels;
    List<MediosMasivosModel>lisMediosMasivosModels;
    List<NivelEstudiosModel>lisNivelEstudiosModels;
    List<TipoSanguineoModel>listipoSanguineoModels;

   

    public ListasGeneralesModel() {
    }

    public ListasGeneralesModel(List<TipoIdentificacionModel> lisTipoIdentificacionModels, List<GeneroModel> lisGeneroModels, List<ProfesionesModel> lisProfesionesModels, List<EstadoCivilModel> lisEstadoCivilModels, List<TipoSolicitudModel> lisTipoSolicitudModels, List<CategoriaSisbenModel> lisCategoriaSisbenModels, List<CiudadModel> lisCiudadModels, List<MediosMasivosModel> lisMediosMasivosModels, List<NivelEstudiosModel> lisNivelEstudiosModels) {
        this.lisTipoIdentificacionModels = lisTipoIdentificacionModels;
        this.lisGeneroModels = lisGeneroModels;
        this.lisProfesionesModels = lisProfesionesModels;
        this.lisEstadoCivilModels = lisEstadoCivilModels;
        this.lisTipoSolicitudModels = lisTipoSolicitudModels;
        this.lisCategoriaSisbenModels = lisCategoriaSisbenModels;
        this.lisCiudadModels = lisCiudadModels;
        this.lisMediosMasivosModels = lisMediosMasivosModels;
        this.lisNivelEstudiosModels = lisNivelEstudiosModels;
    }

    public List<TipoIdentificacionModel> getLisTipoIdentificacionModels() {
        return lisTipoIdentificacionModels;
    }

    public void setLisTipoIdentificacionModels(List<TipoIdentificacionModel> lisTipoIdentificacionModels) {
        this.lisTipoIdentificacionModels = lisTipoIdentificacionModels;
    }

    public List<GeneroModel> getLisGeneroModels() {
        return lisGeneroModels;
    }

    public void setLisGeneroModels(List<GeneroModel> lisGeneroModels) {
        this.lisGeneroModels = lisGeneroModels;
    }

    public List<ProfesionesModel> getLisProfesionesModels() {
        return lisProfesionesModels;
    }

    public void setLisProfesionesModels(List<ProfesionesModel> lisProfesionesModels) {
        this.lisProfesionesModels = lisProfesionesModels;
    }

    public List<EstadoCivilModel> getLisEstadoCivilModels() {
        return lisEstadoCivilModels;
    }

    public void setLisEstadoCivilModels(List<EstadoCivilModel> lisEstadoCivilModels) {
        this.lisEstadoCivilModels = lisEstadoCivilModels;
    }

    public List<TipoSolicitudModel> getLisTipoSolicitudModels() {
        return lisTipoSolicitudModels;
    }

    public void setLisTipoSolicitudModels(List<TipoSolicitudModel> lisTipoSolicitudModels) {
        this.lisTipoSolicitudModels = lisTipoSolicitudModels;
    }

    public List<CategoriaSisbenModel> getLisCategoriaSisbenModels() {
        return lisCategoriaSisbenModels;
    }

    public void setLisCategoriaSisbenModels(List<CategoriaSisbenModel> lisCategoriaSisbenModels) {
        this.lisCategoriaSisbenModels = lisCategoriaSisbenModels;
    }

    public List<CiudadModel> getLisCiudadModels() {
        return lisCiudadModels;
    }

    public void setLisCiudadModels(List<CiudadModel> lisCiudadModels) {
        this.lisCiudadModels = lisCiudadModels;
    }

    public List<MediosMasivosModel> getLisMediosMasivosModels() {
        return lisMediosMasivosModels;
    }

    public void setLisMediosMasivosModels(List<MediosMasivosModel> lisMediosMasivosModels) {
        this.lisMediosMasivosModels = lisMediosMasivosModels;
    }

    public List<NivelEstudiosModel> getLisNivelEstudiosModels() {
        return lisNivelEstudiosModels;
    }

    public void setLisNivelEstudiosModels(List<NivelEstudiosModel> lisNivelEstudiosModels) {
        this.lisNivelEstudiosModels = lisNivelEstudiosModels;
    }
    
     public List<TipoSanguineoModel> getListipoSanguineoModels() {
        return listipoSanguineoModels;
    }

    public void setListipoSanguineoModels(List<TipoSanguineoModel> listipoSanguineoModels) {
        this.listipoSanguineoModels = listipoSanguineoModels;
    }

    
    }