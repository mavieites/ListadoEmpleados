package com.qindel.empleados.listadoEmpleados;

import com.qindel.empleados.Excel.importar.ImportarExcelEmpleados;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.FileNotFoundException;

@SpringBootApplication
public class ListadoEmpleadosApplication {

	public ListadoEmpleadosApplication() throws FileNotFoundException {
	}

	public static void main(String[] args) {
		SpringApplication.run(ListadoEmpleadosApplication.class, args);

		String out = "Hello Spring Boot World";
		System.out.println(out);
		ImportarExcelEmpleados importarExcell;

	}


}
