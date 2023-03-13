package com.qindel.empleados.listadoEmpleados;

import com.qindel.empleados.excel.importar.ImportarExcelEmpleados;
import com.qindel.empleados.model.Empleado;
import com.qindel.empleados.controller.EmpleadoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class ListadoEmpleadosApplication extends SpringBootServletInitializer {

	public ListadoEmpleadosApplication() throws FileNotFoundException {
	}

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ListadoEmpleadosApplication.class, args);

		String out = "Hello Spring Boot World";
		System.out.println(out);
		ImportarExcelEmpleados importarExcell;
		ImportarExcelEmpleados importarExcelEmpleados = new ImportarExcelEmpleados();
		List<Empleado> empleados = importarExcelEmpleados.excelImport();
//		for (Empleado empleado: empleados
//			 ) {
//			empleadoController.save(empleado);
//		}
	}

	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources (ListadoEmpleadosApplication.class);
	}

}
