package com.qindel.empleados.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(value= "Empleado")
@AllArgsConstructor
public class Empleado {

    @Id
    private long id;
    private long codigo;
    private String nombre;
    private String proyecto;
    private String responsableProyecto;
    private String area;
    private String responsableArea;
    private String localizacion;
    private Date fechaAsigDesde;
    private Date fechaAsigHasta;
    private long asignacionProyecto;
    private Date fechaInicioEmpresa;
    private Date fechaComienzoProfesional;
    private long experiencia;


}
