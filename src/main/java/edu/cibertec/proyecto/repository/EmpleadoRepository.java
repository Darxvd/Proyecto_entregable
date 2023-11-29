package edu.cibertec.proyecto.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.cibertec.proyecto.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{	
	Empleado findById(int idemp);
	@Query(value="select * from tb_empleado where nom_empleado LIKE %:nombre%", nativeQuery = true)
	List<Empleado> findByNombre(@Param("nombre") String nombre);
}
