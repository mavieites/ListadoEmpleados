package com.qindel.empleados.excel.Exportar;

import com.qindel.empleados.model.Empleado;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import java.util.List;
import java.util.Map;

@Component
public class ExportarExcelEmpleados extends AbstractXlsView {
    @Override
    protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setHeader("Content-Disposition", "atachement, filename=\"listadoEmpleados.xlsx\"");

        Sheet sheet = workbook.createSheet("ListadoEmpleados");
        Row filaTitulo = sheet.createRow(0);
        Cell celda = filaTitulo.createCell(0);
        celda.setCellValue("LISTADO DE EMPLEADOS");
        Row cabecera = sheet.createRow(2);
        String[] columnas = {"Id","Codigo","Nombre","Proyecto","Responsable Proyecto", "Area", "Responsable Area",
                            "Localizacion","Fecha Asignacion Desde","Fecha Asignacion Hasta", "Asignacion al Proyecto",
                            "Fecha Inicio Empresa", "Fecha de comienzo profesional","Experiencia en anhos"};
        for(int i=0; i<columnas.length; i++){
            celda = cabecera.createCell(i);
            celda.setCellValue(columnas[i]);
        }
        int numFila = 3;
        Row fileData = sheet.createRow(numFila);
        List<Empleado> listadoEmpleados = (List<Empleado>) model.get("Empleado");
        for (Empleado empleado:listadoEmpleados
             ) {
            fileData.createCell(0).setCellValue(empleado.getId());
            fileData.createCell(1).setCellValue(empleado.getCodigo());
            fileData.createCell(2).setCellValue(empleado.getId());
            fileData.createCell(3).setCellValue(empleado.getResponsableProyecto());
            fileData.createCell(4).setCellValue(empleado.getArea());
            fileData.createCell(5).setCellValue(empleado.getResponsableArea());
            fileData.createCell(6).setCellValue(empleado.getLocalizacion());
            fileData.createCell(7).setCellValue(empleado.getFechaAsigDesde());
            fileData.createCell(8).setCellValue(empleado.getFechaAsigHasta());
            fileData.createCell(9).setCellValue(empleado.getAsignacionProyecto());
            fileData.createCell(10).setCellValue(empleado.getFechaInicioEmpresa());
            fileData.createCell(11).setCellValue(empleado.getFechaComienzoProfesional());
            fileData.createCell(12).setCellValue(empleado.getExperiencia());

            numFila ++;
        }
    }
}
