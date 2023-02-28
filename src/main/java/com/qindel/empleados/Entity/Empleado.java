package com.qindel.empleados.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@Data
@SpringBootApplication
@AllArgsConstructor
public class Empleado {

    private long id;
    private long codigo;
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
    private long experiencia;


}
