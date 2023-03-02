package com.qindel.empleados.service;

import com.qindel.empleados.model.Empleado;
import com.qindel.empleados.repository.EmpleadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpleadoService {
    private final EmpleadoRepository empleadoRepository;

    public void save(Empleado empleado){
        empleadoRepository.save(empleado);
    }
    public List<Empleado> findAll(){
        return empleadoRepository.findAll();
    }
    public Optional<Empleado> findById(long id){
        return empleadoRepository.findById(id);
    }
    public void deleteById(long id){
        empleadoRepository.deleteById(id);
    }
}
