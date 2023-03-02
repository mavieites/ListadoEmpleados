package com.qindel.empleados.listadoEmpleados;

import com.qindel.empleados.excel.importar.ImportarExcelEmpleados;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootApplication
public class ListadoEmpleadosApplication {

	public ListadoEmpleadosApplication() throws FileNotFoundException {
	}

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ListadoEmpleadosApplication.class, args);

		String out = "Hello Spring Boot World";
		System.out.println(out);
		ImportarExcelEmpleados importarExcell;
		ImportarExcelEmpleados importarExcelEmpleados = new ImportarExcelEmpleados();
		importarExcelEmpleados.excelImport();

	}


}
