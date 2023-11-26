package edu.cibertec.proyecto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cibertec.proyecto.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

	
	Empleado findById(int idemp);
	
	
}
