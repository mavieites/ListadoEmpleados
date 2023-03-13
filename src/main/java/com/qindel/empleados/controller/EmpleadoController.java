package com.qindel.empleados.controller;

import com.qindel.empleados.model.Empleado;
import com.qindel.empleados.service.EmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class EmpleadoController {
    @Autowired
    private  EmpleadoService empleadoService;

    @PostMapping("/empleados")
    @ResponseStatus(HttpStatus.OK)
    public void save(@RequestBody Empleado empleado){
        empleadoService.save(empleado);
    }

    @GetMapping("/empleados")
    @ResponseStatus(HttpStatus.OK)
    public List<Empleado> findAll(){
        return empleadoService.findAll();
    }

    @GetMapping("/empleado/id")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Empleado> findById(@PathVariable long id){
        return empleadoService.findById(id);
    }

    @DeleteMapping("/empleado/id")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable long id){
        empleadoService.deleteById(id);
    }

    @PutMapping("/empleados")
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Empleado empleado){
        empleadoService.save(empleado);
    }
}
