package com.qindel.empleados.excel.importar;

import com.qindel.empleados.model.Empleado;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Data
@AllArgsConstructor
public class ImportarExcelEmpleados {

    public List<Empleado> excelImport() throws IOException {
        List<Empleado> empleados = new ArrayList<>();
        long id = 0;
        long codigo = 0;
        String nombre = "";
        String proyecto = "";
        String responsableProyecto = "";
        String area = "";
        String responsableArea = "";
        String localizacion = "";
        Date fechaAsigDesde = null;
        Date fechaAsigHasta = null;
        long asignacionProyecto = 0;
        Date fechaInicioEmpresa = null;
        Date fechaComienzoProfesional = null;
        long experiencia = 0;


        long start = System.currentTimeMillis();
        String excelFilePath = "C:\\Users\\mavietes\\Documents\\workspaceNew\\Listado.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = firstSheet.iterator();
        iterator.next();
        while(iterator.hasNext()){
            Row row = iterator.next();
            Iterator<Cell> iteratorCell = row.cellIterator();
            while (iteratorCell.hasNext()) {
                Cell cell = iteratorCell.next();
                int columnIndex = cell.getColumnIndex();
                switch (columnIndex){
                    case 0:
                        id = (long) cell.getNumericCellValue();
                        System.out.println(id);
                        break;
                    case 1:
                        codigo = (long) cell.getNumericCellValue();
                        System.out.println(codigo);
                        break;
                    case 2:
                        nombre = cell.getStringCellValue();
                        System.out.println(nombre);
                        break;
                    case 3:
                        proyecto = cell.getStringCellValue();
                        System.out.println(proyecto);
                        break;
                    case 4:
                        responsableProyecto = cell.getStringCellValue();
                        System.out.println(responsableProyecto);
                        break;
                    case 5:
                        area = cell.getStringCellValue();
                        System.out.println(area);
                        break;
                    case 6:
                        responsableArea = cell.getStringCellValue();
                        System.out.println(responsableArea);
                        break;
                    case 7:
                        localizacion = cell.getStringCellValue();
                        System.out.println(localizacion);
                        break;
                    case 8:
                        fechaAsigDesde = cell.getDateCellValue();
                        System.out.println(fechaAsigDesde);
                        break;
                    case 9:
                        fechaAsigHasta = cell.getDateCellValue();
                        System.out.println(fechaAsigHasta);
                        break;
                    case 10:
                        asignacionProyecto = (long) cell.getNumericCellValue();
                        System.out.println(asignacionProyecto);
                        break;
                    case 11:
                        fechaInicioEmpresa = cell.getDateCellValue();
                        System.out.println(fechaInicioEmpresa);
                        break;
                    case 12:
                        fechaComienzoProfesional = cell.getDateCellValue();
                        System.out.println(fechaComienzoProfesional);
                        break;
                    case 13:
                        experiencia = (long) cell.getNumericCellValue();
                        System.out.println(experiencia);
                        break;
                }
                empleados.add(new Empleado(id,codigo,nombre,proyecto,responsableProyecto,area,responsableArea, localizacion,
                        fechaAsigDesde,fechaAsigHasta,asignacionProyecto,fechaInicioEmpresa,fechaComienzoProfesional,experiencia));
            }

        }
        workbook.close();
        long end = System.currentTimeMillis();
        System.out.printf("Importacion hecha en %d ms\n",(end-start));

        return empleados;
    }

    private Date CastToDate(String stringCellValue) {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formato.parse(stringCellValue);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
