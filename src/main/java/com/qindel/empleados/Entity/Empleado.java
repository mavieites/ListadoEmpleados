package com.qindel.empleados.Entity;

import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Data
public class Empleado {

    private int id;
    private int codigo;
    private String proyecto;
    private String responsableProyecto;
    private String area;
    private String responsableArea;
    private String localizacion;
    private Date fechaAsigDesde;
    private Date fechaAsigHasta;
    private String asignacionProyecto;
    private Date fechaInicioEmpresa;
    private Date fechaComienzoProfesional;
    private int experiencia;


}
