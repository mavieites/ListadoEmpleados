package controller;

import com.qindel.empleados.model.Empleado;
import com.qindel.empleados.service.EmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class EmpleadoController {
    private final EmpleadoService empleadoService;

    @PostMapping("/empleados")
    public void save(@RequestBody Empleado empleado){
        empleadoService.save(empleado);
    }

    @GetMapping("/empleados")
    public List<Empleado> findAll(){
        return empleadoService.findAll();
    }

    @GetMapping("/empleado/id")
    public Optional<Empleado> findById(@PathVariable long id){
        return empleadoService.findById(id);
    }

    @DeleteMapping("/empleado/id")
    public void deleteById(@PathVariable long id){
        empleadoService.deleteById(id);
    }
}
