package com.qindel.empleados.repository;

import com.qindel.empleados.model.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends MongoRepository<Empleado,Long> {
}
